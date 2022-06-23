package com.example.Anthony_John_Order_Parts_CaseStudy.service;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AircraftPartInventoryService {
    // SAVE AIRCRAFT PART
    AircraftPartInventoryEntity savePart(AircraftPartInventoryEntity aircraftPartInventoryEntity);

    List<AircraftPartInventoryEntity> getAllParts();
}
