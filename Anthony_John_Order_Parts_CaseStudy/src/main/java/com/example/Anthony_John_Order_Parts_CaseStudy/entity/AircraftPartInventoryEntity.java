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
    private long partId;  // PK for the aircraft part

    // IMPORT THE AIRCRAFT PART MODEL
    @ManyToOne
    @JoinColumn(name = "aircraft_part_id")
    private AircraftPartInventoryEntity aircraftPartInventoryEntity;

    // IMPORT THE USER ENTITY
    @ManyToOne
    @JoinColumn(name = "user")
    private UserEntity userEntity;

    // IMPORT THE ADMIN ENTITY
    @ManyToOne
    @JoinColumn(name = "admin")
    private AdminEntity adminEntity;

    // AIRCRAFT PART DESCRIPTION
    @Column
    private String partDescription;

    // AIRCRAFT PART INSTOCK
    @Column
    private boolean inStock;

    // AIRCRAFT LIST PRICE
    @Column
    private double listPrice;

    // NO ARGS/ALL ARGS
    public AircraftPartInventoryEntity() {
    }
    public AircraftPartInventoryEntity(String partDescription, boolean inStock, double listPrice) {
        this.partDescription = partDescription;
        this.inStock = inStock;
        this.listPrice = listPrice;
    }
}
