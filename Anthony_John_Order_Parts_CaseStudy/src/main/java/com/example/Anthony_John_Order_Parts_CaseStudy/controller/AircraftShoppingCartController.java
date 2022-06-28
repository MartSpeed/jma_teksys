package com.example.Anthony_John_Order_Parts_CaseStudy.controller;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftCartItem;
import com.example.Anthony_John_Order_Parts_CaseStudy.entity.UserEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.service.AircraftCartService;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.Authenticator;
import java.util.List;

@Controller
public class AircraftShoppingCartController {
    // import aircraft cart services
    @Autowired
    private AircraftCartService service;

    @Autowired
    private UserServices userService;

    // GET

    // HANDLER METHOD FOR HTTP GET REQUEST
    @GetMapping("/cart")
    public String showShoppingCart(Model model, @AuthenticationPrincipal Authentication authentication){
        UserEntity userEntity = userService.getCurrentlyLoggedInUser(authentication);
         // return a list of cart item objects
        List<AircraftCartItem> cartItems =  service.listCartItems(userEntity);

        //
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("pageTitle", "Shopping Cart");

        return"shopping_cart";
    }


    // POST
    // UPDATE
    // DELETE
}


