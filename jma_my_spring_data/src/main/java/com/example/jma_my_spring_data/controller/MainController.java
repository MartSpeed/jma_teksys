package com.example.jma_my_spring_data.controller;

import com.example.jma_my_spring_data.entity.StateEntity;
import com.example.jma_my_spring_data.repository.StateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.nimbus.State;

@Controller
@RequestMapping(path="/")
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class);
    @Autowired
    private StateRepository stateRepo;

    // POST START
    @PostMapping(path="/addState")
    public @ResponseBody String addNewState(@RequestParam String state, @RequestParam String capitol){
        StateEntity newState = new StateEntity(); // new object created
        newState.setName(state); // SET the state name
        newState.setCapitol(capitol); // SET the capitol name
        stateRepo.save(newState); // SAVE the objects we SET
        return "SAVED THE CURRENT STATE"; // user/client feedback loop
    }
    // POST END

    // GET START
    @GetMapping(path="/getAll")
    public @ResponseBody Iterable<StateEntity> getAllStates(){
        logger.info("GETALL METHOD");

        return stateRepo.findAll(); // ???
    }
    // GET END
}
