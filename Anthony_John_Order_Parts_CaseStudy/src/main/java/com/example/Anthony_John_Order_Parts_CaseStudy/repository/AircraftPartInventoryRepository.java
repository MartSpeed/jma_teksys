package com.example.Anthony_John_Order_Parts_CaseStudy.repository;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftCartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftPartInventoryRepository extends JpaRepository<AircraftCartItem, Long> {
}
