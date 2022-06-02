package com.example.ex_managementproject.controller;

import com.example.ex_managementproject.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    // building out the maps

    // get our list
    @GetMapping(value="/list-users")
    public String showUsers(Model model){
    // model allows you to add attributes to your variables
        return "html";
    }

    // POST
    @PostMapping(value="/add-users")
    public String addUser(ModelMap model, @Valid UserEntity userEntity, BindingResult result){
        if(result.hasErrors()){
            // return html page
            return "userEntity";
        }
    return userEntity.setUser_name(model);
        // save the user
        // return to the user list
    }
}
