package com.example.ex_my_spring_data.controller;

/*CONTROLLER
* author: Anthony, John
* DESCRIPTION: the controller controls the traffic(mapping) of the information we would like to use and who it flows to???
* */

import com.example.ex_my_spring_data.entity.UserEntity;
import com.example.ex_my_spring_data.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
// request mapping is used for pathing what the URL starts with
@RequestMapping(path ="/example")
public class MainController {
    /*DEPENDENCY INJECTION
    * DESCRIPTION: @Autowired
    *   tells us that the constructor will be using dependency injection. @Autowire is the Spring
    *   annotation to let the BEAN FACTORY know to use this method.
    * */
    @Autowired
    private UserRepository user;

    // LOGGER
    Logger logger = LoggerFactory.getLogger(MainController.class);

    // POST
    @PostMapping(path="/add") // each path that is setup requires a HANDLER(a method)
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        // create new user object
        // SETTERS
        UserEntity newUser = new UserEntity();
        // SET the name
        newUser.setName(name);
        // SET the email
        newUser.setEmail(email);
        // tell the UserRepository() WHAT to UserRepository.save(???)
        user.save(newUser);
        return "SAVED NEW USER";
    }

    @GetMapping(path="/getAll") // GET
    public @ResponseBody Iterable<UserEntity> getAllUser(){
        //
        return user.findAll();
    }
}
