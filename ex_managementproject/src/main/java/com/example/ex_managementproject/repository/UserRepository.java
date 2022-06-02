package com.example.ex_managementproject.repository;

import com.example.ex_managementproject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // creating a custom query
        //@Query("Select user from userTable")
    // create a custom method
    // find the username by the param
    List<UserEntity> findByUserName(String user);
}
