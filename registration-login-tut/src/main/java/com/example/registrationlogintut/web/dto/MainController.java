package com.example.registrationlogintut.web.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // GET

    // HANDLER METHOD FOR LOGIN page
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    // POST
    // UPDATE
    // DELETE
}
