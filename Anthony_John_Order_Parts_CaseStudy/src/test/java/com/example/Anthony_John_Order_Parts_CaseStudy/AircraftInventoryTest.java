package com.example.Anthony_John_Order_Parts_CaseStudy;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftCartItem;
import com.example.Anthony_John_Order_Parts_CaseStudy.entity.UserEntity;
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
public class AircraftInventoryTest {

    // DEPENDENCY INJECTION FOR PART ITEM
    @Autowired
    private AircraftPartInventoryRepository repo;

    // USED TO PERFORM COMMON OPERATIONS ON THE DATABSE
    @Autowired
    private TestEntityManager testEntityManager;

    // TEST METHOD FOR CART ITEMS
    @Test
    public void testOnePart() {
        //
        AircraftCart aircraftPart = testEntityManager.find(AircraftCart.class, 7);
        //
        UserEntity userEntity = testEntityManager.find(UserEntity.class, 3);

        // CREATE A NEW PART ITEM
        AircraftCartItem newPart = new AircraftCartItem();
        newPart.setUserEntity(userEntity);
        newPart.setAircraftPartEntity(aircraftPart);
        newPart.setQuantity(1);
        AircraftCartItem savedPart =  repo.save(newPart);
        // SET ID PART HAS ID GREATER THAN 0
        assertTrue(savedPart.getId() > 0);
    }

    // TEST METHOD FOR FINDING ITEMS BY USER
    @Test
    public void testGetPartByCustomer(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(2);
        // RETURN A COLLECTION OF PART ITEM OBJECTS
        List<AircraftPartEntity> aircraftPartEntities = repo.findByUser(userEntity);
        assertEquals(2, aircraftPartEntities.size());
    }
}
