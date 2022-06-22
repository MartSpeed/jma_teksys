package com.customer.controller;

import com.customer.model.Customer;
import com.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customerapi")
public class CustomerController {
    @Autowired
    private CustomerService customerServices;

    public CustomerService getService() {
        return customerServices;
    }

    public void setService(CustomerService customerServices) {
        this.customerServices = customerServices;
    }

    // GET
    @GetMapping("/getCustomer")
    public String getCustomer(Model model){
        model.addAttribute("formData", new Customer());
        return "redirect:/customerapi/createCustomer";
    }

    // POST
    // add customer
    @PostMapping("/getCustomer")
    public String createCustomer(@ModelAttribute("formData") Customer customer, Model model){
        model.addAttribute("name", customer.getName());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("phone", customer.getPhone());
        model.addAttribute("state", customer.getState());

//        if(!customer.equals(null)){
//            customerServices.addCustomer(customer);
//        }

        return "customerapi/view";
    }

    // UPDATE

    // DELETE
}
