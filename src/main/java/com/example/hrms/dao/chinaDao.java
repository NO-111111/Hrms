package com.example.hrms.dao;

import com.example.hrms.entity.dgtx_places;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface chinaDao {
    @Select("select * from dgtx_places where parent_id = 1")
    List<dgtx_places> getProvince();
    @Select("select * from dgtx_places where parent_id = #{parent_id} ")
    List<dgtx_places> getCity(Integer parent_id);
    @Select("select id from dgtx_places where cname = #{province} ")
    Integer getparent_id(String province);

}
