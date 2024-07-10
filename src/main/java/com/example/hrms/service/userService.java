package com.example.hrms.service;


import com.example.hrms.entity.user;

public interface userService {

    public user findById(int user_id);
    public int  addUser(user user);
    //根据用户名查询用户
    public user findByUsername(String username);
    //注册
    public void register(String username,String password);
    //更新用户基本信息
    public void update(user user);
}
