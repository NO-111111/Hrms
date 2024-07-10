package com.example.hrms.controller;

import com.example.hrms.entity.Result;
import com.example.hrms.entity.user;
import com.example.hrms.service.userService;
import com.example.hrms.utils.*;

import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

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
    public Result update(@RequestBody user user){
        userService.update(user);
        return Result.success();
    }
}
