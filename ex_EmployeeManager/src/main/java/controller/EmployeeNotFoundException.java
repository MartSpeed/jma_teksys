package controller;


// CREATING CUSTOM EXCEPTIONS IN SPRINGBOOT
public class EmployeeNotFoundException extends RuntimeException{
	EmployeeNotFoundException(Long employee_id){
		super("Could not find employee " + employee_id);
	}
}
