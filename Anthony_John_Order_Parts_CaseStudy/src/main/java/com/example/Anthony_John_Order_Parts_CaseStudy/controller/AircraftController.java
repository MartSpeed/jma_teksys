package com.example.Anthony_John_Order_Parts_CaseStudy.controller;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/")
public class AircraftController {
    @Autowired
    AircraftPartInventoryRepository aircraftRepo;

    // FIND ALL PARTS
    @GetMapping("/totalinventory")
    public List<AircraftPartInventoryEntity> allAircraftParts (){
        return aircraftRepo.findAll();
    }

    // FIND BY NAME
//    @GetMapping("/nameinventory")
//    public List<AircraftCraftPartInventoryEntity> allPartNames

    // FIND BY ID
    // FIND BY TYPE


}


