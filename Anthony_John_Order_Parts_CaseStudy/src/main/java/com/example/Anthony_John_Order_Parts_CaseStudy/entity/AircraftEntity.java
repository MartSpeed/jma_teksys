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
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
    @Column(name="aircraft_id")
    private long aircraftId;  // PK for the aircraft

    // name of aircraft
    @Column(name="aircraft_name")
    private String aircraftName;

    // requires a Nose Landing Gear
    // requires a Left Main Landing Gear
    // requires a Right Main Landing Gear
    @Column(name="landing_gear")
    private String landingGear;

    // requires a Left Wing
    // requires a Right Wing
    @Column(name="aircraft_wing")
    private String aircraftWing;

    // requires a Left Elevator
    // requires a Right Elevator
    @Column(name="aircraft_elevator")
    private String aircraftElevator;

    @Column(name="aircraft_rudder")
    private String aircraftRudder;
}
