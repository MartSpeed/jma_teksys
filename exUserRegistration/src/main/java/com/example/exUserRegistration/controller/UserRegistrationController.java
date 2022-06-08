package com.example.exUserRegistration.controller;
/*      DESCRIPTION:
        this controller is mapped to "/registration" URL. we use the
        UserRegistrationDta to process and validate the user registration
        form and inject it using the @ModelAttribute("user") annotation.
        when the form is submitted its automatically validated and errors
        are available in the BindingResult. check is a user doesn't really
        exist with the submitted email. if the form has any errors, we
        return to the registration page. otherwise, we redirect and inform
        the user the registration procedure is complete.
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
     //
    @Autowired
    private UserService userService;

    //
    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    //
    @GetMapping
    public String showRegistrationForm(Model model){
        return "registration";
    }

    //
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto, BindingResult result){
        User existing = userService.findByEmail(userDto.getEmail());
        if(existing != null){
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if(result.hasErrors()){
            return "registration";
        }
        userService.save(userDto);
        return "redirect:/registration?success";
    }
}
