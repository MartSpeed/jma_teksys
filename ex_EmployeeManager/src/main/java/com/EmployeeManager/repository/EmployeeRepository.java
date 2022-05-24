package com.EmployeeManager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeManager.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	void addEmployee();

	Employee getEmployeeId(int id);

	List<Employee> getAllEmployees();

	void updateEmployee(Employee employee);

	void deleteEmployee(int id);

}
