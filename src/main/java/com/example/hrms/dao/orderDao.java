package com.example.hrms.dao;

import com.example.hrms.entity.order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface orderDao {
    @Select("select * from order where order_id = #{order_id}")
    public order findById(int order_id);
}
