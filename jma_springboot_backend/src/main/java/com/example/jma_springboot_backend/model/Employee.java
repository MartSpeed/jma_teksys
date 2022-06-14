package com.example.jma_springboot_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    // adding a single comment
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
