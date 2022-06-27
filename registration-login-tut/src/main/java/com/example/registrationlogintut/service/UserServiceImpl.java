package com.example.registrationlogintut.service;

import com.example.registrationlogintut.model.Role;
import com.example.registrationlogintut.model.User;
import com.example.registrationlogintut.repository.UserRepository;
import com.example.registrationlogintut.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        super();
        this.userRepository= userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getEmail(),
                registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
