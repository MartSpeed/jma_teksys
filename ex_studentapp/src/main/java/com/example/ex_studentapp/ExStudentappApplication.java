package com.example.ex_studentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.controller.StudentController;
import com.example.entity.StudentEntity;
import com.example.service.StudentView;

//@SpringBootApplication
public class ExStudentappApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ExStudentappApplication.class, args);
		// student retriever
		StudentEntity model = retrieveStudent();
		// then we will show it???
		StudentView view = new StudentView();
		// grab the controller
		StudentController controller = new StudentController(model, view);
		//
		controller.updateView();
		// update model
		controller.setStudentName("Tashigi");
		controller.setStudentRollNo("20");
		// dont forget to update the view every time
		controller.updateView();
		
	}
	// creating a retriever???
	private static StudentEntity retrieveStudent() {
		StudentEntity student = new StudentEntity();
		student.setName("ZoroJuro");
		student.setRollNo("2");
		return student;
	}

}
