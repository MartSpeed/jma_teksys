package com.example.jma_my_spring_data.repository;

import com.example.jma_my_spring_data.entity.StateEntity;
import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<StateEntity, Integer> {
}
