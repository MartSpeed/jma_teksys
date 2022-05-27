package com.example.ex_Thymeleafproject.entity;

import javax.persistence.Entity;

//@Entity
public class UserEntity {
    private String name;
    private String email;

    public UserEntity() {
    }

    public UserEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
