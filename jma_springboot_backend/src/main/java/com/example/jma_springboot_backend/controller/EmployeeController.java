package com.example.jma_springboot_backend.controller;

import com.example.jma_springboot_backend.model.Employee;
import com.example.jma_springboot_backend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/* NOTE: you can also use the @Controller annotation, however you would need to
    implement the @Responsebody annotation on each and every REST API that we define.
* */
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    // inject employee service Dependency
    private EmployeeService employeeService;

    // right-click, source, generate constructor
    // since we are using constructor based DI
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // build create employee RES API
    // the return method ResponseEntity with a GENERIC class of EmployeeEntity
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        // return the ResponseEntity overloaded constructor method
        // the body is the Employee object employeeService
        // call the save method employeeService.saveEmployee()
        // and pass the param of the object youre going to save employeeService.saveEmployee(employee)
        // HttpStatus.CREATED = response 201 OK
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    // build GET ALL EMPLOYEES REST API
}
