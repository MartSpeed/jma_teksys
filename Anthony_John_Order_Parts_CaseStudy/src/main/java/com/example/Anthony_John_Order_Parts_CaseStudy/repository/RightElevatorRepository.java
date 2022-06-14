package com.example.Anthony_John_Order_Parts_CaseStudy.repository;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.RightElevatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RightElevatorRepository extends JpaRepository<RightElevatorEntity, Long> {

}
