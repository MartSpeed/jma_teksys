package com.example.Anthony_John_Order_Parts_CaseStudy.service.impl;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import com.example.Anthony_John_Order_Parts_CaseStudy.service.AircraftPartInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftPartInventoryImpl implements AircraftPartInventoryService {
    @Autowired
    private AircraftPartInventoryRepository aircraftRepo;

    // SAVE AIRCRAFT PARTS INVEN
    public void savePart(AircraftPartInventoryEntity aircraftEntity) {
    // when the part list is created, the entity will be saved
        aircraftRepo.save(aircraftEntity);
    }
}
