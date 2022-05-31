package com.example.jma_EmployeeManager.service;

import com.example.jma_EmployeeManager.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    // specify the types of methods that we want
    // use the Employee Repo to populate the data in service
    //READ method for employee
    List<Employee> getAllEmployees();
    // to get the employee by ID
    Optional<Employee> getEmployeeById(long id);

    //CREATE method for employee
    void addEmployee(Employee employee);

    //UPDATE method for employee
    void editEmployee(Employee employee);

    //DELETE method for employee
    void deleteEmployee(long Id);

}
