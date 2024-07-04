package com.example.hrms.dao;

import com.example.hrms.entity.house;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface houseDao {
    @Select("select * from house where H_id = #{H_id}")
    public house findById(int H_id);
}
