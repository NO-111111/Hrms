package com.example.hrms.dao;

import com.example.hrms.entity.house;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface houseDao {
    @Select("select * from house where H_id = #{H_id}")
    public house findById(int H_id);
    @Select("select * from house where province=#{province} and city=#{city} and area=#{area} and price between #{mony_min} and #{mony_max}")
    List<house> search(String province, String city, String area, Integer mony_min, Integer mony_max);
}
