package com.example.hrms.service.Impl;

import com.example.hrms.dao.orderDao;
import com.example.hrms.entity.order;
import com.example.hrms.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderServiceImpl implements orderService {
    @Autowired
    private orderDao orderDao;

    @Override
    public List<order> findOrderById(Integer userId) {
        return orderDao.findOrderById(userId);
    }
    @Override
    public void addOrder(order order) {
         orderDao.addOrder(order);
    }




}
