package com.example.ex_managementproject.repository;

import com.example.ex_managementproject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // creating a custom query
        //@Query("Select user from userTable")


    // create a custom method
    // find the username by the param
    List<UserEntity> findByUser_name(String user);

    // my code no longer follow his for some reason???
    List<UserEntity> findAllByActiveOrderByIdDesc(boolean active);

    //
    Optional<UserEntity> findByIdAndActive(long user_id, boolean active);
}
