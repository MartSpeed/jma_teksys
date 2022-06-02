package com.example.ex_managementproject.service;

import com.example.ex_managementproject.entity.UserEntity;

import java.util.Date;
import java.util.List;
import java.util.Optional;

// INTERFACE METHODS
public interface UserServiceImpl {
    // building abstract method calls
    List<UserEntity> getUserByUsername(String user_name);

    // get the user by Id
    // Optional??? may or may not contain a null value
    Optional<UserEntity> getUsernameById(long user_id);

    // UPDATE
    void updateUser(UserEntity user);

    // ADD
    void addUser(UserEntity userEntity);

    // DELETE
    void deleteUser(long id);

    // SAVE
    void saveUser(UserEntity user);
}
