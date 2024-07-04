package com.example.hrms.dao;


import com.example.hrms.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface userDao  {
    @Select("select * from user where user_id = #{user_id}")
    public user findById(int user_id);
}
