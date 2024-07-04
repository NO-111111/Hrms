package com.example.hrms.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface commentDao {
    @Select("insert into comment(user_id,post_id,comment_body) values(#{user_id},#{post_id},#{comment_body})")
    public void addcomment(int user_id,int post_id,String comment_body) ;

}
