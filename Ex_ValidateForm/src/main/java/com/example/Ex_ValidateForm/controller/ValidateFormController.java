package com.example.Ex_ValidateForm.controller;

import com.example.Ex_ValidateForm.entity.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

// tell java this is a controller, how the entity information will be used
@Controller
public class ValidateFormController implements WebMvcConfigurer {
    // controller method to assist webmvc???

    // helps us get the view from the validate form
    public void addViewController(ViewControllerRegistry registry){
        // add view to the registry method
        @Override
        registry.addViewController("/html").setViewName("html");
    }

    // GET METHOD START
    @GetMapping(value="/")
    public String getForm(PersonForm personForm){
        // this will become the HTML URL
        return "html";
    }
    // GET METHOD END

    // POST METHOD START
    @PostMapping(value="/")
    public String checkInfo(@Valid PersonForm personForm, BindingResult bindingResult){
        // if it has errors
        if(bindingResult.hasErrors()){
            // this will become the HTML URL
            return "form";
        }
        // this will become the HTML URL
        return "redirect:/html";
    }
    // POST METHOD END
}
