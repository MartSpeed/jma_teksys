//package com.example.Anthony_John_Order_Parts_CaseStudy.service;
//
//import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartEntity;
//import com.example.Anthony_John_Order_Parts_CaseStudy.entity.UserEntity;
//import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AircraftPartInventoryImpl implements AircraftPartInventoryService{
//    @Autowired
//    private AircraftPartInventoryRepository repo;
//
//    public List<AircraftPartEntity> listParts(UserEntity userEntity){
//        return repo.findByUser(userEntity);
//    }
//}
