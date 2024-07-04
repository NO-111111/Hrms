package com.example.hrms.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class order {
    private int user_id;
    private int H_id;
    private BigDecimal price;
    private Timestamp date;
    private int order_id;
}
