package com.example.hrms.service.Impl;

import com.example.hrms.dao.chinaDao;
import com.example.hrms.entity.dgtx_places;
import com.example.hrms.service.chinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class chinaServiceImpl implements chinaService {
    @Autowired
    private chinaDao chinaDao;

    @Override
    public List<dgtx_places> getProvince() {
        return chinaDao.getProvince();
    }

    @Override
    public List<dgtx_places> getCity(Integer parent_id) {
        return chinaDao.getCity(parent_id);
    }

    @Override
    public Integer getparent_id(String Province) {
        return chinaDao.getparent_id(Province);
    }

}
