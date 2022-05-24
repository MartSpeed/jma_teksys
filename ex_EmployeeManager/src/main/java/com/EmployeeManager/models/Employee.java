package com.EmployeeManager.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
//@Component look up this method
@Data
@Entity
@Table(name="employee")
public class Employee implements Serializable{
	// fields or DI
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employee_id;
	
	// FIELD AS COLUMN
	// naming column names
	@Column(name="name", nullable = false)
	private String employee_name;
	
	@Column(name="salary")
	private String employee_salary;
}
