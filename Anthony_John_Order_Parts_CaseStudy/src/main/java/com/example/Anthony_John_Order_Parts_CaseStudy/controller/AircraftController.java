package com.example.Anthony_John_Order_Parts_CaseStudy.controller;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@RequestMapping("/home")
public class AircraftController {
    @Autowired
    private AircraftPartInventoryRepository aircraftRepo;

    // FIND ALL PARTS
    @GetMapping("/aircraftform")
    public ModelAndView allAircraftParts (){
        //
        ModelAndView mav = new ModelAndView("aircraftform");
        //
        AircraftPartInventoryEntity aircraftPartInven = new AircraftPartInventoryEntity();
        mav.addObject("aircraftPartInven", aircraftPartInven);
        return mav;
    }

    @PostMapping("/aircraftform") // save the aircraft model
    public String addPart(@ModelAttribute AircraftPartInventoryEntity part) {
        aircraftRepo.save(part);
        return "redirect:/aircraftform";
    }
}


