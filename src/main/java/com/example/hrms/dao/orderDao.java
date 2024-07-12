package com.example.hrms.dao;

import com.example.hrms.entity.order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface orderDao {
    @Select("select * from order where order_id = #{order_id}")
    public order findById(int order_id);
    @Select("select * from `order` where user_id = #{user_id}")
    List<order> findOrderById(Integer user_id);
    @Insert("insert into `order`(user_id,price,date) values(#{user_id},#{price},#{date})")
    void addOrder(order order);
}
