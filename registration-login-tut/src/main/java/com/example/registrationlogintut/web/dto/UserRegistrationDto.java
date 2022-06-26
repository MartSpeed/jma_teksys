package com.example.registrationlogintut.web.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRegistrationDto {
    private String firstName, lastName, email, password;
}
