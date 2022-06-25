package com.example.jma_thymetut.controller;

import com.example.jma_thymetut.entity.EmployeeEntity;
import com.example.jma_thymetut.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired // DEPENDENCY INJECTION
    private EmployeeRepository repo;

    // GET
    //HANDLER METHOD FOR FORM DISPLAY
    @GetMapping({"/showEmployees", "/", "/list"}) // what are the curly braces for?
    public ModelAndView showEmployees(){
        // create the ModelAndView OBJECT and takes the THYMELEAF template name "list-employees"
        ModelAndView mav = new ModelAndView("list-employees");
        // use the EmployeeRepository to use CRUD methods to return a List<EmployeeEntity> of Employees
        List<EmployeeEntity> list = repo.findAll();
        // add the List<EmployeeEntity> to the ModelAndView OBJECT, takes a K,V pair
        mav.addObject("employees" , list);
        return mav;
    }

    // HANDLER METHOD FOR ADD EMPLOYEE BUTTON
    @GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeForm() {
        // create the ModelAndView OBJECT and uses the THYMELEAF template name "add-employee-form"
        ModelAndView mav = new ModelAndView("add-employee-form");
        // new employee object to bind to the addEmployee form
        EmployeeEntity newEmployee = new EmployeeEntity();
        // add the newEmployee object to the ModelAndView Object, takes a K,V pair
        mav.addObject("employee", newEmployee);
        // return the object
        return mav;
    }

    // HANDLER METHOD FOR SAVING THE NEW ADDED EMPLOYEE OBJECTS
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute EmployeeEntity employee){
        repo.save(employee);
        return "redirect:/list";
    }

    //HANDLER METHOD FOR THE UPDATE BUTTON
    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long employeeId){
        // create the ModelAndView Object and use the THYMELEAF template name "show-update-form"
        ModelAndView mav = new ModelAndView("add-employee-form");
        // use the repo to call JpaRepository methods
        // .get() gives us the employee object, store in employee variable
        // return an Optional
        EmployeeEntity employee = repo.findById(employeeId).get();
        // save the employee to the ModelAndView object
        mav.addObject("employee", employee);
        return mav;

    }

    // POST
    // UPDATE
    // DELETE
}
