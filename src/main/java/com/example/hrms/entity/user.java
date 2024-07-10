package com.example.hrms.entity;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
public class user {
    private int user_id;
    private String username;
    @JsonIgnore
    private String password;
    private String email;
    private String sex;
    private String photo;
    private String name;
    private String phonenum;
    private String province;
    private String city;
    private String area;
    private String street;
    private int age;
    private String role;
    private String nickname;
}
