package com.example.hrms.service;


import com.example.hrms.entity.user;

public interface userService {
    //根据id查询用户
    public user findById(Integer user_id);
    public int  addUser(user user);
    //根据用户名查询用户
    public user findByUsername(String username);
    //注册
    public void register(String username,String password);
    //更新用户基本信息
    public void update(user user);
    // 更新头像
    public void updateAvatar(String avatarUrl);
    //更新密码
    void updatePwd(String newPwd);
}
