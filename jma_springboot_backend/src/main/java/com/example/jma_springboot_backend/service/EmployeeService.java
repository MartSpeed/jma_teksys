package com.example.jma_springboot_backend.service;

import com.example.jma_springboot_backend.model.Employee;

import java.util.List;

public interface EmployeeService {
    // create a JAVA CLASS that implements the EMPLOYEE INTERFACE

    // define one method
    // implement inside employee services
    Employee saveEmployee(Employee employee);

    // get all employees' method, return using a list
    List<Employee> getAllEmployees();
}
