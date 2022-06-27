/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the aircraft will inform the user if the aircraft is in need of maintenance or not.
    this class will hold the aircraft objects:
    landing gear entity (Nose, Left Main, Right Main),
    elevator entity (Left, Right),
    rudder entity,
    wing entity ( Left wing, right wing)
*/
package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.*;

import javax.persistence.*;


@Data
@Getter
@Setter
@Entity
@Table(name="aircraft_part_inventory")
public class AircraftPartInventoryEntity {

    // AIRCRAFT INVENTORY FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;  // PK for the aircraft part

    // IMPORT THE AIRCRAFT PART MODEL
    @ManyToOne
    @JoinColumn(name = "aircraft_part")
    private AircraftPartEntity aircraftPartEntity;

    // IMPORT THE USER ENTITY
    @ManyToOne
    @JoinColumn(name = "user")
    private UserEntity userEntity;

    // AIRCRAFT PART DESCRIPTION
    @Column
    private String partDescription;

    // AIRCRAFT PART QUANITY
    @Column
    private int quantity;

    // AIRCRAFT PART INSTOCK
    @Column
    private boolean inStock;

    // AIRCRAFT LIST PRICE
    @Column
    private double listPrice;

    // NO ARGS/ALL ARGS
    public AircraftPartInventoryEntity() {
    }

    public AircraftPartInventoryEntity(AircraftPartEntity aircraftPartEntity, UserEntity userEntity, String partDescription, int quantity, boolean inStock, double listPrice) {
        this.aircraftPartEntity = aircraftPartEntity;
        this.userEntity = userEntity;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.inStock = inStock;
        this.listPrice = listPrice;
    }
}
