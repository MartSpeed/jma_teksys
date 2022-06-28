//package com.example.Anthony_John_Order_Parts_CaseStudy.controller;
//
//import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
//import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
//import com.example.Anthony_John_Order_Parts_CaseStudy.service.AircraftPartInventoryService;
//import com.example.Anthony_John_Order_Parts_CaseStudy.service.impl.AircraftPartInventoryImpl;
//import org.apache.logging.log4j.util.PerformanceSensitive;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpSession;
//import java.util.List;
//
//@Controller
////@RequestMapping("/home")
//public class AircraftController {
//
//    // INJECT AIRCRAFT SERVICE DEPENDENCY
//    private AircraftPartInventoryService aircraftPartInventoryService;
//
//    // CONSTRUCTOR BASED DEPENDENCY INJECTION
//    @Autowired
//    public AircraftController(AircraftPartInventoryService aircraftPartInventoryService) {
//        this.aircraftPartInventoryService = aircraftPartInventoryService;
//    }
//
//    // GET METHODS
//
//    // HANDLER METHOD FOR AIRCRAFT FROM VIEW HTML PAGE
//    @GetMapping("/aircraftform/view")
//    public String displayPart(Model model, HttpSession session){
//        // when submitting
//        // save the session and redirects to display
//        model.addAttribute("aircraftEntity", aircraftPartInventoryService.findByAcftName(session.getAttribute("taco2").toString()));
//        //
//        return "aircraftDisplay";
//    }
//
//    // **find the reference for taco**
//    // HANDELR METHOD FOR DISPLAYING THE AIRCRAFTFORM FILE
//
//    @GetMapping("/aircraftform")
//    public String getAllParts(@ModelAttribute("taco") AircraftPartInventoryEntity aircraftPartInventoryEntity, BindingResult result, Model model){
//        List<AircraftPartInventoryEntity> aircraftPartInventoryEntity2 = aircraftPartInventoryService.getAllParts();
//        // model.addAttribute is needed when using thymeleaf in springboot to display the requested object
//        model.addAttribute("aircraftPartInventoryEntities", aircraftPartInventoryEntity2);
//        return "/aircraftform";
//    }
//
//    // POST METHODS
//
//    // HANDLER METHOD TO SAVE AIRCRAFT PART
//    @PostMapping("/aircraftform")
//    public ResponseEntity<AircraftPartInventoryEntity> savePart(@RequestBody AircraftPartInventoryEntity aircraftPartInventoryEntity){
//        return new ResponseEntity<AircraftPartInventoryEntity>(aircraftPartInventoryService.savePart(aircraftPartInventoryEntity), HttpStatus.CREATED);
//    }
//
//    // HANDLER METHOD FOR DISPLAYING THE AIRCRAFT PART INFORMATION
//    @PostMapping("aircraftform/postForm")
//    public String postPart(@ModelAttribute("aircraft") AircraftPartInventoryEntity aircraftPartInventoryEntity, HttpSession session){
//        System.out.println(aircraftPartInventoryEntity.getPartName());
//        // create a new aircraft object
//        AircraftPartInventoryEntity aircraftPartInventory = new AircraftPartInventoryEntity();
//        // GET AIRCRAFT NAME
//        aircraftPartInventory.setPartName(aircraftPartInventoryEntity.getPartName());
//        // GET AIRCRAFT PART NAME
//        aircraftPartInventory.setPartName(aircraftPartInventoryEntity.getPartName());
//        // **find the reference for taco2**
//        // [x]
//        session.setAttribute("taco2", aircraftPartInventoryEntity.getPartName());
//        // SAVE THE PART OBJECT
//        aircraftPartInventoryService.savePart(aircraftPartInventoryEntity);
//        return "redirect:/aircraftform/view";
//    }
//}
//
//
