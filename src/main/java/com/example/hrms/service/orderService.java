package com.example.hrms.service;

import com.example.hrms.entity.order;

import java.util.List;

public interface orderService {


    List<order> findOrderById(Integer userId);

    void addOrder(order order);
}
