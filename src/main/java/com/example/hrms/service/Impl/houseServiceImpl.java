package com.example.hrms.service.Impl;

import com.example.hrms.dao.houseDao;
import com.example.hrms.entity.house;
import com.example.hrms.service.houseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class houseServiceImpl implements houseService {
    @Autowired
    private houseDao houseDao;
    @Override
    public List<house> search(String province, String city, String area, Integer mony_min, Integer mony_max) {

        return houseDao.search(province,city,area,mony_min,mony_max);

    }
}
