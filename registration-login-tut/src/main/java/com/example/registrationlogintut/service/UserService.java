package com.example.registrationlogintut.service;

import com.example.registrationlogintut.model.User;
import com.example.registrationlogintut.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    //create save user method and pass a DTO object
    User save(UserRegistrationDto registrationDto);
}
