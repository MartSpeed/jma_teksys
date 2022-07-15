package com.example.registrationlogintut.repository;

import com.example.registrationlogintut.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // find a user by email address
    User findByEmail(String email);
}
