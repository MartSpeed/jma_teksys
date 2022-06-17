package com.example.jma_springboot_backend.repository;

import com.example.jma_springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// we DONT need to use the @Repository annotation, but thats not good practice
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
