package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.EmployeeEntity;
import repository.EmployeeRepository;

// informing that class what type of controller it is
@RestController
public class EmployeeController {
	
	
	//
	private final EmployeeRepository employeeRepository;

	//
	EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	//*****GET*****
	// where the file or information is located to be drawn from
	// is this a GET/POST setup???
	// all "MAPPING" require a method underneath to work
	@GetMapping("/employees")
	//
	List<EmployeeEntity> all() {
		//
		return employeeRepository.findAll();
	}

	//*****POST*****
	@PostMapping("/employees")
	// when we make a post to the db,
	EmployeeEntity newEmployee(@RequestBody EmployeeEntity newEmployee) {
		//
		return employeeRepository.save(newEmployee);
	}

	// know as "ENDPOINTS" = ("employees")
	@GetMapping("employees/{id}")
	//
	EmployeeEntity employee_id(@PathVariable Long employee_id) {
		// i want to return the employee id
		return employeeRepository.findById(employee_id).orElseThrow(() -> new EmployeeNotFoundException(employee_id));
	}

}
