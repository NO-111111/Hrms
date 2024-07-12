package com.example.hrms.controller;

import com.example.hrms.entity.Result;
import com.example.hrms.entity.order;
import com.example.hrms.service.orderService;
import com.example.hrms.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
@Validated
@CrossOrigin
public class ordercontroller {
    @Autowired
    private orderService orderService;
    @GetMapping("/list")
    public Result<List<order>> list() {
        Map<String, Object> claims = ThreadLocalUtil.get();
        Integer user_id =(Integer) claims.get("user_id");
        List<order> orderlist = orderService.findOrderById(user_id);
        return Result.success(orderlist);
    }
    @PostMapping("/addOrder")
    public Result addOrder(@Validated order order) {
        orderService.addOrder(order);
        return Result.success();
    }
}
