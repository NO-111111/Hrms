package com.example.hrms.entity;

import lombok.Data;

@Data
public class house {
    private int H_id;
    private String H_name;
    private String type;
    private String province;
    private String city;
    private String area;
    private String street;
    private double H_size;
    private int H_certnum;
}
