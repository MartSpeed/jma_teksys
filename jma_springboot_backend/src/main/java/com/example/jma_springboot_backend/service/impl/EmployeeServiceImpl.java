package com.example.jma_springboot_backend.service.impl;

import com.example.jma_springboot_backend.model.Employee;
import com.example.jma_springboot_backend.repository.EmployeeRepository;
import com.example.jma_springboot_backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
// YOu dont HAVE to add the @Transactional annotation here because
// spring provides a transaction to all of its methods
// but thats not good practice
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    // a JAVA CLASS which IMPLEMENTS yhr EMPLOYEE SERVICE INTERFACE

    /* NOTE: there are teo types of DEPENDENCY INJECTION(DI)
       1. SETTER-BASED DI is whenever you have Optional parameters
       2. CONSTRUCTOR BASED DI is whenever we have a MANDATORY parameters???

       use Employee Repository as a mandatory parameter, so we will use CONSTRUCTOR
       BASED DI

       NOTE: as we are using CONSTRUCTOR BASED DI, you need to generate the constructor
       you are NOT REQUIRED to add the @Autowired annotation to the CONSTRUCTOR because
       when SPRING finds spring bean with only ONE constructor then by default SPRING will
       configure the dependency
    * */

    private EmployeeRepository employeeRepository;

    // source, right click, generate constructor, since we are using CONSTRUCTOR BASED DI
    // we dont HAVE to add the @Autowired notation because only a single bean exist inside this JAVA class
    // but thats not good practice
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        // save the instance of the employee to the database(DB)
        return employeeRepository.save(employee);
    }



}
