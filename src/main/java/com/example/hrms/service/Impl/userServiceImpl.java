package com.example.hrms.service.Impl;


import com.example.hrms.entity.user;
import com.example.hrms.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrms.dao.userDao;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userDao userDao;
    @Override
    public user findById(int user_id){
        return userDao.findById(user_id);
    }
}
