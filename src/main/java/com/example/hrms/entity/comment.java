package com.example.hrms.entity;

import lombok.Data;

@Data
public class comment {
    private int comment_id;
    private int user_id;
    private int post_id;
    private String comment_body;
    private int good_num;
}
