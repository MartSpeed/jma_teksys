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
@Entity
@Table(name = "aircraft")
public class AircraftEntity {

    /*
        what does your aircraft need to be whole?
        these objects will connect to the aircraft object to,
        1. fix the aircraft as the overall task including the methods below,
        2. order parts for a status update,
        3. show fixed or completed aircraft,
        4. order parts for plane by proper order id
    */

    // AIRCRAFT FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aircraftId;  // PK for the aircraft

    // requires a Nose Landing Gear
    // requires a Left Main Landing Gear
    // requires a Right Main Landing Gear
    private String landingGear;

    // requires a Left Wing
    // requires a Right Wing
    private String wing;

    // requires a Left Elevator
    // requires a Right Elevator
    private String elevator;

    private String rudder;
}
