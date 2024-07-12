package com.example.hrms.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class order {
    private Integer user_id;
    private Integer H_id;
    private BigDecimal price;
    private Timestamp date;
    private Integer order_id;
}
