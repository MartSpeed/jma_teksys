package com.example.ex_Thymeleafproject.controller;

// identify it as a controller

import com.example.ex_Thymeleafproject.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    // create the GET REQUEST INCANTATION/PROMISE
    @GetMapping(value="/")
    // method handler goes beneath the INCANTATION
    public String index(){
        // we want to return a page called index.html
        return "index";
    }

    @RequestMapping(value="/profile", method = RequestMethod.POST)
    // the holder for both the model and mvc frameworks
    public ModelAndView profile(@ModelAttribute UserEntity userEntity) {
        // use the model view for VIEWING and POSTING information
        ModelAndView modelAndView = new ModelAndView();
        // view it on the profile.html page
        modelAndView.setViewName("profile");
        // attach to that page, access to the data from the userEntity
        modelAndView.addObject("UserEntity", userEntity);
        //
        return modelAndView;
    }
}
