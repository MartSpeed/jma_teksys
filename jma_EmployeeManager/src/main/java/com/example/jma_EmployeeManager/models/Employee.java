package com.example.jma_EmployeeManager.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
public class Employee {
    // giving our employee attributes
    // FIELDS START
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="fName", nullable = false)
    private String firstName;

    @Column(name="lName", nullable = false)
    private String lastName;
    // FIELDS END

    // constructor
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
