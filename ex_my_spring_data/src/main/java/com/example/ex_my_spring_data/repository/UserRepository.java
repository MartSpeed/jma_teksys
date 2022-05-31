package com.example.ex_my_spring_data.repository;

import com.example.ex_my_spring_data.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/* REPOSITORY INTERFACE
* REPOSITORY/DAO is in INTERFACE the will EXTENDS a Jpa/CRUD Library of some type for DB calls and structure*/
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
