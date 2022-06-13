package com.example.jma_springboot_backend.model;

import lombok.Data;

@Data
public class Employee {
    //
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
