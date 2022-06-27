package com.example.registrationlogintut.web.dto;

import lombok.*;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRegistrationDto {
    @Column
    private String firstName, lastName, email, password;
}
