package com.example.hrms.controller;

import com.example.hrms.entity.Result;
import com.example.hrms.entity.house;
import com.example.hrms.service.houseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/house")
@Validated
@CrossOrigin
public class housecontroller {
    @Autowired
    private houseService houseService;
    @PostMapping("/search")
    public Result<List<house>> search(@RequestBody Map<String,Object> params) {
        String province = (String) params.get("province");
        String city = (String)params.get("city");
        String area = (String)params.get("area");
        Integer mony_min = (Integer) params.get("mony_min");
        Integer mony_max = (Integer) params.get("mony_max");
        List<house> houseinfo = houseService.search(province,city,area,mony_min,mony_max);
        return Result.success(houseinfo);
    }

}
