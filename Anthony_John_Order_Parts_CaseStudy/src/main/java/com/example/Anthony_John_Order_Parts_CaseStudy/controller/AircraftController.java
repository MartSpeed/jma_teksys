package com.example.Anthony_John_Order_Parts_CaseStudy.controller;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import com.example.Anthony_John_Order_Parts_CaseStudy.service.AircraftPartInventoryService;
import com.example.Anthony_John_Order_Parts_CaseStudy.service.impl.AircraftPartInventoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/home")
public class AircraftController {
    // INJECT AIRCRAFT SERVICE DEPENDENCY
    private AircraftPartInventoryService aircraftPartInventoryService;

    // CONSTRUCTOR BASED DEPENDENCY INJECTION
    public AircraftController(AircraftPartInventoryService aircraftPartInventoryService) {
        this.aircraftPartInventoryService = aircraftPartInventoryService;
    }

    //
    @PostMapping("/aircraftform")
    public ResponseEntity<AircraftPartInventoryEntity> savePart(@RequestBody AircraftPartInventoryEntity aircraftPartInventoryEntity){
        return new ResponseEntity<AircraftPartInventoryEntity>(aircraftPartInventoryService.savePart(aircraftPartInventoryEntity), HttpStatus.CREATED);
    }

    @GetMapping("/aircraftform")
    public List<AircraftPartInventoryEntity> getAllParts(AircraftPartInventoryEntity aircraftPartInventoryEntity){
        return aircraftPartInventoryService.getAllParts(aircraftPartInventoryEntity.getAircraftName(), aircraftPartInventoryEntity.getAircraftModel());
    }














    // ORIGINAL CODE
    // FIND ALL PARTS
//    @GetMapping("/aircraftform")
//    public String allAircraftParts (){
//        //List<AircraftPartInventoryEntity> allParts;
//        aircraftRepo.findAll();
//        return "aircraftform";
//    }
//
//    @PostMapping("/aircraftform") // save the nose gear
//    public String addPart(AircraftPartInventoryEntity part) {
//        aircraftRepo.save(part);
//        return "redirect:/aircraftform";
//    }

    // OTHER CODE
    // this is set inside of the ipml file
//    @Autowired
//    private AircraftPartInventoryImpl aircraftImpl;

    // ORIGINAL CODE
//    @Autowired
//    private AircraftPartInventoryRepository aircraftRepo;

    // FIND ALL PARTS
    // NEW CODE
//    @GetMapping("/aircraftform")
//    public String allAircraftParts (){
//        return "aircraftform";
//    }
//
//    @PostMapping("/aircraftform") // save the aircraft model
//    public String addPart(@ModelAttribute AircraftPartInventoryEntity part, BindingResult result, Model model) {
//        // if the result !hasErrors
//        // add new part with message
//        if(!result.hasErrors()){
//            //
//            aircraftImpl.savePart(part);
//            model.addAttribute("SUCCESSFULLY ADDED PARTS\n");
//            model.addAttribute("AIRCRAFT PART: ", new AircraftPartInventoryEntity());
//        }
//        return "redirect:/aircraftform";
//    }
}


