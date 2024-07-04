package com.example.hrms.dao;

import com.example.hrms.entity.post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface postDao {
    @Select("select * from user where post_id = #{post_id}")
    public post findById(int post_id);
}
