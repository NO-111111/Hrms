package com.example.hrms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class user {
    @NotNull
    private int user_id;
    private String username;
    @JsonIgnore
    private String password;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String sex;
    private String photo;
    private String name;
    @NotEmpty
    private String phonenum;
    @NotEmpty
    private String province;
    @NotEmpty
    private String city;
    @NotEmpty
    private String area;
    @NotEmpty
    private String street;
    @NotNull
    private int age;
    private String role;
    @Pattern(regexp = "^\\S{1,10}$")
    @NotEmpty
    private String nickname;
}
