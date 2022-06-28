package com.example.Anthony_John_Order_Parts_CaseStudy.service;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftCartItem;
import com.example.Anthony_John_Order_Parts_CaseStudy.entity.UserEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftCartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AircraftCartServiceImpl implements AircraftCartService {
    // reference to the aircraftCartItemRepository
    @Autowired
    private AircraftCartItemRepository repo;

    // list cart items by user
    public List<AircraftCartItem> listCartItems(UserEntity userEntity){
        return repo.findByUser(userEntity);
    }
}
