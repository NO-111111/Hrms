package com.example.hrms.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class communicate {
    private int user_id1;
    private int user_id2;
    private String com_body;
    private Timestamp date;
    private String com_type;
    private Timestamp c_time;

}
