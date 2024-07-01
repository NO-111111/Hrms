package com.example.hrms.service;

import com.example.hrms.pojo.user;
import com.example.hrms.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceimpl implements userService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public user getUser(String username) {
        return userMapper.getUser(username);
    }
}
