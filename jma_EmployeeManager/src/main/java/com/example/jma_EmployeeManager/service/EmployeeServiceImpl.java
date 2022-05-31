package com.example.jma_EmployeeManager.service;

import com.example.jma_EmployeeManager.models.Employee;
import com.example.jma_EmployeeManager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    //
    @Autowired
    EmployeeRepository rep;

    @Override
    public Optional<Employee> getEmployeeById(long id){
        return rep.findById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return rep.findAll();
    }

    @Override
    public void addEmployee(Employee employee) {
        rep.save(employee);
    }

    @Override
    public void editEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(long id) {
        rep.deleteById(id);
    }
}
