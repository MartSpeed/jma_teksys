package jpa.dao;

import jpa.entitymodels.studentEntity;

import java.util.List;

import jpa.entitymodels.courseEntity;
import jpa.entitymodels.studentEntity;

public interface StudentDAO {
	// INTERFACE THAT IMPLEMENTS THESE FOLLOWING CLASSES
	
	// all student information is contained here and out put into a list
	List<Student> getAllStudents(); 
	
	// grabbing the student email information
	Student getStudentByEmail(String sEmail); 
	
	// checks to make sure the email and password values match for correct entry
	boolean validateStudent(String sEmail, String sPassword); 
	
	// adding a student to a course
	void registerStudentToCourse(String sEmail, Integer cId); 
	
	// get student courses as a List
	List<Course> getStudentCourses(); 
}
