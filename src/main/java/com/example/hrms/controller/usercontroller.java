package com.example.hrms.controller;

import com.example.hrms.entity.user;
import com.example.hrms.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {
    @Autowired
    private userService userService ;
    @RequestMapping("/findById")
    public user findById(int user_id){
        return userService.findById(user_id);
    }
}
