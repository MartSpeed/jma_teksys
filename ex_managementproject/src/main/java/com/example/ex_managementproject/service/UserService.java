package com.example.ex_managementproject.service;

import com.example.ex_managementproject.entity.UserEntity;
import com.example.ex_managementproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


// telling java this is my service file
// the go between for our UserEntity and UserServiceImpl files
@Service
public class UserService implements UserServiceImpl{
    // using @Autowire to implement a repository???
    // wires in the UserRepository to use the data in the Service methods
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getUserByUsername(String user_name) {
        // this method is a list inside of the controller
        return userRepository.findByUserName(user_name);
    }

    @Override
    public Optional<UserEntity> getUsernameById(long user_id) {
        return userRepository.findById(user_id);
    }

    @Override
    public void updateUser(UserEntity user) {

    }

    @Override
    public void addUser(String user_name, String user_description, Date targetDate, boolean isWorking) {

    }

    @Override
    public void deleteUser(long id) {

    }

    @Override
    public void saveUser(UserEntity user) {
        userRepository.save(user);
    }
}
