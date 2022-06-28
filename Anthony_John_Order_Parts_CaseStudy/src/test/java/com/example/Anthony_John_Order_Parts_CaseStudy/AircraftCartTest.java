package com.example.Anthony_John_Order_Parts_CaseStudy;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftCartItem;
import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftProduct;
import com.example.Anthony_John_Order_Parts_CaseStudy.entity.UserEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftCartItemRepository;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class AircraftCartTest {
    @Autowired
    private AircraftCartItemRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    // TEST ADDING ONE ITEM TO THE CART
    @Test
    public void testAddOneCartItem(){
        AircraftProduct aircraftProduct = entityManager.find(AircraftProduct.class, 2);
        UserEntity userEntity = entityManager.find(UserEntity.class, 1);

        AircraftCartItem newPart = new AircraftCartItem();
        newPart.setUserEntity(userEntity);
        newPart.setAircraftProduct(aircraftProduct);
        newPart.setQuantity(1);

        AircraftCartItem saveCartItem = repo.save(newPart);

        assertTrue(saveCartItem.getId() > 0);
    }
<<<<<<< HEAD
=======

    // TEST METHOD FOR AIRCRAFT CART ITEM REPOSITORY
    @Test
    public void testGetCartItemByUser(){
        // create new user object
        UserEntity userEntity = new UserEntity();
        userEntity.setId(5);

        List<AircraftCartItem> cartItems = repo.findByUser(userEntity);

        assertEquals(2,cartItems.size());
    }

>>>>>>> main
}
