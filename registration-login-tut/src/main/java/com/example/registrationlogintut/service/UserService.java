package com.example.registrationlogintut.service;

import com.example.registrationlogintut.model.User;
import com.example.registrationlogintut.web.dto.UserRegistrationDto;

public interface UserService {
    //create save user method and pass a DTO object
    User save(UserRegistrationDto registrationDto);
}
