package controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

// CREATING OUR OWN CUSTOM EXCPETION
@ControllerAdvice
public class EmployeeNotFoundAdv {
	//
	@ResponseBody
	
	//
	@ExceptionHandler(EmployeeNotFoundException.class)
	
	//
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	// if employee is not found then the exception message we created will output to the user
	String employeeNotFoundHandler(EmployeeNotFoundException ex) {
		return ex.getMessage();
	}
}
