package com.example.Anthony_John_Order_Parts_CaseStudy;

import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftProduct;
import com.example.Anthony_John_Order_Parts_CaseStudy.entity.UserEntity;
import com.example.Anthony_John_Order_Parts_CaseStudy.repository.AircraftPartInventoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

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

    // TEST AN ITEM ADDED TO THE CART WITH THE ID OF 7
    @Test
    public void testOnePart() {
        //
        AircraftCart aircraftPart = testEntityManager.find(AircraftCart.class, 7);
        //
        UserEntity userEntity = testEntityManager.find(UserEntity.class, 3);

        // CREATE A NEW PART ITEM
        AircraftProduct newPart = new AircraftProduct();
        newPart.setUserEntity(userEntity);
        newPart.setAircraftPartEntity(aircraftPart);
        newPart.setQuantity(1);
        AircraftProduct savedPart =  repo.save(newPart);
        // SET ID PART HAS ID GREATER THAN 0
        assertTrue(savedPart.getId() > 0);
    }
}
