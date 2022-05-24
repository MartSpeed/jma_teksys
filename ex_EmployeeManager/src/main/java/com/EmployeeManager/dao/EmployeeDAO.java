package com.EmployeeManager.dao;

import java.util.List;

import com.EmployeeManager.models.Employee;

public interface EmployeeDAO {
	// CRUD METHODS
	// CREATE
	void addEmployee();
	Employee getEmployeeId(int id);
	// READ
	List<Employee> getAllEmployees();
	// UPDATE
	void updateEmployee(Employee employee);
	// DELETE
	void deleteEmployee(int id);
}
