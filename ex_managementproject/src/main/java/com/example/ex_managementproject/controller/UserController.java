package com.example.ex_managementproject.controller;

import com.example.ex_managementproject.entity.UserEntity;
import com.example.ex_managementproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    //@Autowire or Dependency Injection for the UserService file
    @Autowired
    private UserService userService;

    // building out the maps

    // GET our list
    @GetMapping(value="/listusers")
    public String showUsers(Model model){
    // model allows you to add attributes to your variables
        //
        List<UserEntity> user_list = userService.getAllUsers();
        // add all attributes from the list to the user
        model.addAttribute("users", user_list);
        //
        model.addAttribute("users", new UserEntity());
        return "html";
    }

    // POST
    @PostMapping(value="/addusers")
    public String addUser(Model model, @Valid UserEntity userEntity, BindingResult result){
        // checking for a NULL entry
        if(result.hasErrors()){
            // return HTML page
            return "userEntity";
        }
        // else save the user
        // & return the user list
        userService.addUser(userEntity);

        // redirect the return
        return "redirect:/";
    }

    //??? i missed this one, forgot my focus totem
    @GetMapping(path="/${user_id}")
    public String getUsers(@PathVariable("user_id") Integer user_id, Model model){
    // still need to understand Model more
        // Optional??? can be null can be not null
        Optional<UserEntity> userInfo = userService.getUsernameById(user_id);
        // its going to display the information we want to edit
        model.addAttribute("userInfo", userInfo);
        // return it to an edit page
        return "edit";
    }
}
