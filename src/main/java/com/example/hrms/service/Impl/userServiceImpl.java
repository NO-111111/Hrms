package com.example.hrms.service.Impl;


import com.example.hrms.entity.user;
import com.example.hrms.service.userService;
import com.example.hrms.utils.MD5Utils;
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
    @Override
    public int  addUser(user user){
        return userDao.addUser(user);
    }

    @Override
    public user findByUsername(String username){
        return userDao.findByUsername(username);
    }
    @Override
    public void register(String username,String password){
       //加密
        String MD5String = MD5Utils.getMD5String(password);
        //注册
        userDao.register(username,MD5String);
    }
    @Override
    public void update(user user){
        userDao.update(user);
    }
}
