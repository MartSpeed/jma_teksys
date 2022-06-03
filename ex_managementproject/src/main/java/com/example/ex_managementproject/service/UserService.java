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

    // method to get all users and return them
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public List<UserEntity> getUserByUsername(String user_name) {
        // this method is a list INSIDE the controller
        return userRepository.findByUser_name(user_name);
    }

    @Override
    public Optional<UserEntity> getUsernameById(long user_id) {
        return userRepository.findById(user_id);
    }

    @Override
    public void updateUser(UserEntity user) {
        // why do we also save user here???
        // we are updating the user as a new name/number
        userRepository.save(user);
    }

    @Override
    public void addUser(UserEntity userEntity) {
        // going to leave this ERROR as is
        userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(long id) {
    // OPTIONAL???
        Optional<UserEntity> user = userRepository.findById(id);
        if(user.isPresent()){
            userRepository.delete(user.get());
        }
    }

    // leave alone for 0603
    @Override
    public void saveUser(UserEntity user) {
        userRepository.save(user);
    }
}
