package com.example.registrationlogintut.controller;

import com.example.registrationlogintut.service.UserService;
import com.example.registrationlogintut.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }


    // GET METHOD

    // HANDLER METHOD FOR REGISTRATION FORM, RETURNS AN EMPTY USER OBJECT
    // whenever the user enters form data
    // that DATA will be stored in the user dto object
    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    // HANDLER METHOD FOR REGISTRATION HTML FILE AND HTTP GET REQUEST
    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    // POST METHOD

    //HANDLER METHOD FOR POST HTTP REQUEST FOR REGISTRATION DTO
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){
        // this method contains form data("user") and binds it to the UserRegDto
        // save registered user to database
        userService.save(registrationDto);
        // return to registration page WITH success message
        return "redirect:/registration?success";
    }
    // UPDATE METHOD

    // DELETE METHOD
}
