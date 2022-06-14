package com.example.Anthony_John_Order_Parts_CaseStudy.controller;

import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AircraftController {

    @Autowired
    public AircraftPartInventoryRepository aircraftRepo;





}
