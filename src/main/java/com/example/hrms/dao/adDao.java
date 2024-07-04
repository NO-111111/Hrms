package com.example.hrms.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface adDao {
    @Select("insert into ad(Ad_id,Ad_title,msg) values(#{Ad_id},#{Ad_title},#{msg})")
    public void addAD(int Ad_id);


}
