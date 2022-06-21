package com.example.Anthony_John_Order_Parts_CaseStudy.controller;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/home")
public class AircraftController {
    @Autowired
    private AircraftPartInventoryRepository aircraftRepo;

    // FIND ALL PARTS
    @GetMapping("/aircraftform")
    public String allAircraftParts (){
        //List<AircraftPartInventoryEntity> allParts;
        aircraftRepo.findAll();
        return "/aircraftform";
    }

    @PostMapping("/aircraftform") // save the nose gear
    public String addPart(AircraftPartInventoryEntity part) {
       aircraftRepo.save(part);
       return "redirect:/aircraftform";
    }
    // FIND BY NAME
//    @GetMapping("/nameinventory")
//    public List<AircraftCraftPartInventoryEntity> allPartNames

    // FIND BY ID
    // FIND BY TYPE


}


