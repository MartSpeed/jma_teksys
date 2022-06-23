package com.example.jma_thymetut.controller;

import com.example.jma_thymetut.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired // DEPENDENCY INJECTION
    private EmployeeRepository repo;

    // GET
    @GetMapping({"/list", "/"})
    public ModelAndView showEmployees(){
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees", repo.findAll());
        return mav;
    }

    // POST
    // UPDATE
    // DELETE
}
