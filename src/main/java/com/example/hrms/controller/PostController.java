package com.example.hrms.controller;

import com.example.hrms.entity.Result;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Post")
public class PostController {
    @GetMapping("/list")
    public Result<String> list(@RequestHeader(name = "Authorization") String token , HttpServletResponse response){
        //验证token
//        try {
//            Map<String,Object> claims = JwtUtil.parseToken(token);
//
//        } catch (Exception e) {
//            response.setStatus(401);
//            return Result.error("未登录");
//        }
        return Result.success("所有的帖子数据");
    }
}
