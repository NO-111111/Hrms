package com.example.hrms.controller;

import com.example.hrms.entity.Result;
import com.example.hrms.entity.user;
import com.example.hrms.service.userService;
import com.example.hrms.utils.JwtUtil;
import com.example.hrms.utils.MD5Utils;
import com.example.hrms.utils.ThreadLocalUtil;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping("/user")
@Validated

public class usercontroller {
    @Autowired
    private userService userService ;
    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^\\S{5,16}$") String username, @Pattern(regexp = "^\\S{6,20}$") String password){

        //用户名是否被占用
        if (userService.findByUsername(username) == null) {
            userService.register(username, password);
            return Result.success();
        }
        //注册
        else {
            return Result.error("用户名已被占用");
        }

    }
    @PostMapping("/login")
    public Result<String> login(@Pattern(regexp = "^\\S{5,16}$") String username, @Pattern(regexp = "^\\S{6,20}$") String password){
        //用户名是否存在
        password = MD5Utils.getMD5String(password);
        user loginuser = userService.findByUsername(username);
        if (loginuser == null) {
            return Result.error("用户名错误");
        }
        //密码是否正确
        else if (loginuser.getPassword().equals(password)){
            Map<String, Object> claims = new HashMap<>();
            claims.put("username", username);
            claims.put("user_id", loginuser.getUser_id());
            String token =  JwtUtil.getToken(claims);
            return Result.success(token);
        }

        else return Result.error("密码错误");
    }
    @GetMapping("/userinfo")
    public Result<user> userinfo(){

       Map<String, Object> claims = ThreadLocalUtil.get();
       String username =(String) claims.get("username");
       user user = userService.findByUsername(username);

       return Result.success(user);
    }
    @PutMapping("/update")
    public Result update(@RequestBody @Validated user user){
        userService.update(user);
        return Result.success();
    }
    @PatchMapping("/updateAvatar")
    public Result updateAvatar(@RequestParam @URL String avatarUrl){
        userService.updateAvatar(avatarUrl);
        return Result.success();
    }
    @PatchMapping("/updatePwd")
    public Result updatePassword(@RequestBody Map<String,String> params){
        //校验参数
        String oldPwd = params.get("old_Pwd");
        String newPwd = params.get("new_Pwd");
        String rePwd = params.get("re_Pwd");
        if (!StringUtils.hasLength(oldPwd) || !StringUtils.hasLength(newPwd) || !StringUtils.hasLength(rePwd)){
            return Result.error("缺失必要参数");
        }
        //校验新密码和原密码是否相同
        Map<String, Object> claims = ThreadLocalUtil.get();
        Integer user_id = (Integer) claims.get("user_id");
        user user = userService.findById(user_id);
        if (!user.getPassword().equals(MD5Utils.getMD5String(oldPwd))){
            return Result.error("原密码错误");
        }
        if (!newPwd.equals(rePwd)){
            return Result.error("两次填写的新密码不一致");
        }
        

        return Result.success();
    }
}
