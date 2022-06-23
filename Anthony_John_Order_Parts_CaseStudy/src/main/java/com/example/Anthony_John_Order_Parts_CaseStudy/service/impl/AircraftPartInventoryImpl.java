package com.example.Anthony_John_Order_Parts_CaseStudy.service.impl;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import com.example.Anthony_John_Order_Parts_CaseStudy.service.AircraftPartInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AircraftPartInventoryImpl implements AircraftPartInventoryService {
    private AircraftPartInventoryRepository aircraftRepo;

    @Autowired
    public AircraftPartInventoryImpl(AircraftPartInventoryRepository aircraftRepo){
        this.aircraftRepo = aircraftRepo;
    }

    @Override
    public AircraftPartInventoryEntity savePart(AircraftPartInventoryEntity aircraftPartInventoryEntity) {
        return aircraftRepo.save(aircraftPartInventoryEntity);
    }

    @Override
    public List<AircraftPartInventoryEntity> getAllParts(String aircraftName, String aircraftModel) {
        return aircraftRepo.findAll();
    }

    // SAVE AIRCRAFT PARTS INVEN
}
