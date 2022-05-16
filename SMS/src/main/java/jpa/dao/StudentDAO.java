package jpa.dao;

import java.util.List;

public interface StudentDAO {
	// INTERFACE THAT IMPLEMENTS THESE FOLLOWING CLASSES
	
	// all student information is contained here and out put into a list
	List<StudentDAO> getAllStudents(); 
	
	// grabbing the student email information
	StudentDAO getStudentByEmail(String sEmail); 
	
	// checks to make sure the email and password values match for correct entry
	boolean validateStudent(String sEmail, String sPassword); 
	
	// adding a student to a course
	void registerStudentToCourse(String sEmail, Integer cId); 
	
	// get student courses as a List
	List<CourseDAO> getStudentCourses(); 
}
