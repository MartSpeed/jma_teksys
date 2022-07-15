package com.example.registrationlogintut.web.dto;

import lombok.*;

import javax.persistence.Column;

@Data
@Getter
@Setter
public class UserRegistrationDto {
    private String firstName, lastName, email, password;

    //ALL ARGS/NO ARGS
    public UserRegistrationDto() {
    }

    public UserRegistrationDto(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
