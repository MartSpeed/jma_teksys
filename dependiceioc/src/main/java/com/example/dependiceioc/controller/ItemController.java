package com.example.dependiceioc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
    //CONSTRUCTOR DEPENDENCY INJECTION
    private ItemRepo itemRepo;
    ItemController(ItemRepo itemRepo){
        this.itemRepo = itemRepo;
    }
    //
    @GetMapping(path="/")
    public String show(){
        return "Hello to all";
    }
}
