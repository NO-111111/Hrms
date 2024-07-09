package com.example.hrms.dao;


import com.example.hrms.entity.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userDao  {
    @Select("select * from user where user_id = #{user_id}")
    public user findById(int user_id);
    @Insert("insert into user(user_id,username,password,sex,photo,Name,PhoneNum,email,province,city,area,street,age,role) values(#{user_id},#{username},#{password},#{sex},#{photo},#{Name},#{PhoneNum},#{email},#{province},#{city},#{area},#{street},#{age},#{role})")
    public int addUser(user user);
    @Select("select * from user where username = #{username}")
    public user findByUsername(String username);
    @Insert("insert into user(username,password) values(#{username},#{password})")
    public void register(String username,String password);
}
