package com.example.Anthony_John_Order_Parts_CaseStudy.repository;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftCartItem;
import com.example.Anthony_John_Order_Parts_CaseStudy.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftCartItemRepository extends JpaRepository<AircraftCartItem, Integer> {
    // CUSTOM METHOD TO SEARCH PART BY USER
    public List<AircraftCartItem> findByUser(UserEntity userEntity);
}
