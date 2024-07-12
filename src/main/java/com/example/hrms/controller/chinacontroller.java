package com.example.hrms.controller;


import com.example.hrms.entity.Result;
import com.example.hrms.entity.dgtx_places;
import com.example.hrms.service.chinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping("/china")
@Validated
public class chinacontroller {
    @Autowired
    private chinaService chinaService;
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})


    @GetMapping("/getProvince")
    public Result<List<dgtx_places>> getProvince()
    {
        List<dgtx_places> provincelist =  chinaService.getProvince();
        return Result.success(provincelist);
    }
    @PostMapping("/getCity")
    public Result<List<dgtx_places>> getCity(@RequestBody Map<String,Integer> params)
    {
        Integer parent_id =  params.get("province");
        List<dgtx_places> citylist = chinaService.getCity(parent_id);
        return Result.success(citylist);
    }


}
