package com.example.hrms.service;

import com.example.hrms.entity.house;

import java.util.List;

public interface houseService {

    public List<house> search(String province, String city, String area, Integer mony_min, Integer mony_max);
}
