package com.example.jma_EmployeeManager.repository;

import com.example.jma_EmployeeManager.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
