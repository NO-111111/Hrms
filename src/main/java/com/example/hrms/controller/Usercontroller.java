package com.example.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrms.pojo.user;
import com.example.hrms.service.userService;
import com.example.hrms.service.userServiceimpl;

@RestController
public class Usercontroller {
    @Autowired
    private userService userService ;
    @RequestMapping("/getUser")
    public user getUser(String username){
        return userService.getUser(username);
    }
}
