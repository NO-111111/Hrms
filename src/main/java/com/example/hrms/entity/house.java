package com.example.hrms.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class house {
    @NotNull
    private int H_id;
    private String H_name;
    private String type;
    @NotEmpty
    private String province;
    @NotEmpty
    private String city;
    @NotEmpty
    private String area;
    private String street;
    private double H_size;
    @NotNull
    private Integer price;
    private int H_certnum;
}
