package com.example.controller;

import com.example.entity.StudentEntity;
import com.example.service.StudentView;

public class StudentController {
	// using our model and view to update and control the data being passed through
	// variables are known as "FIELDS" when using HIBERNATE(HQL)
	// variables in springboot are known as "DEPENDENCY INJECTION" (DI)
	// AKA "INVERSION OF CONTROL"(IoC)
	private StudentEntity model;
	private StudentView view;

	public StudentController(StudentEntity model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	// get student name
	public String getStudentName() {
		return model.getName();
	}
	// set student name
	public void setStudentName(String name) {
		model.setName(name);
	}
	// student roll number
	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	public String getRollNo() {
		return model.getRollNo();
	}
	// what is happening, this is where he lost me
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
	// get student roll number

}
