package com.example.hrms.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface historyAndcollection {
    @Select("insert into history(user_id,post_id) values(#{user_id},#{post_id})")
    public void addhistory(int user_id,int post_id);
}
