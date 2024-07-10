package com.example.hrms.dao;


import com.example.hrms.entity.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface userDao  {
    @Select("select * from user where user_id = #{user_id}")
    public user findById(int user_id);
    @Insert("insert into user(user_id,username,password,sex,photo,name,phonenum,email,province,city,area,street,age,role) values(#{user_id},#{username},#{password},#{sex},#{photo},#{Name},#{PhoneNum},#{email},#{province},#{city},#{area},#{street},#{age},#{role})")
    public int addUser(user user);
    @Select("select * from user where username = #{username}")
    public user findByUsername(String username);
    @Insert("insert into user(username,password) values(#{username},#{password})")
    public void register(String username,String password);
    @Update("update user set nickname=#{nickname},phonenum=#{phonenum},email=#{email},province=#{province},city=#{city},area=#{area},street=#{street},age=#{age},sex=#{sex} where user_id=#{user_id}")
    public void update(user user);
    @Update("update user set photo=#{avatarUrl} where user_id=#{user_id}")
    void updateAvatar(String avatarUrl , Integer user_id);
    @Update("update user set password=#{newPwd} where user_id=#{user_id}")
    void updatePwd(String newPwd , Integer user_id);
}
