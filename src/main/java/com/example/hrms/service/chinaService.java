package com.example.hrms.service;

import com.example.hrms.entity.dgtx_places;

import java.util.List;

public interface chinaService {


    List<dgtx_places> getProvince();

    List<dgtx_places> getCity(Integer parent_id);

    Integer getparent_id (String Province);
}
