package com.customer.controller;

import com.customer.model.Customer;
import com.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerapi")
public class CustomerController {
    @Autowired
    private CustomerService customerServices;

    // add customer
    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer){
        customerServices.addCustomer(customer);
    }
}
