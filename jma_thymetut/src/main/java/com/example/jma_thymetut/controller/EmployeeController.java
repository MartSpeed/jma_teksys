package com.example.jma_thymetut.controller;

import com.example.jma_thymetut.entity.EmployeeEntity;
import com.example.jma_thymetut.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired // DEPENDENCY INJECTION
    private EmployeeRepository repo;

    // GET
    @GetMapping("/showEmployees")
    public ModelAndView showEmployees(){
        // create the ModelAndView OBJECT and takes the THYMELEAF template name "list-employees"
        ModelAndView mav = new ModelAndView("list-employees");
        // use the EmployeeRepository to use CRUD methods to return a List<EmployeeEntity> of Employees
        List<EmployeeEntity> list = repo.findAll();
        // add the List<EmployeeEntity> to the ModelAndView OBJECT, takes a K,V pair
        mav.addObject("employees" , list);
        return mav;
    }

    // POST
    // UPDATE
    // DELETE
}
