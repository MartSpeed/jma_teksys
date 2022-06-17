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
public class AircraftPartInventoryEntity {

    /*
        what does your aircraft need to be whole?
        these objects will connect to the aircraft object to,
        1. fix the aircraft as the overall task including the methods below,
        2. order parts for a status update,
        3. show fixed or completed aircraft,
        4. order parts for plane by proper order id
    */

    // AIRCRAFT INVENTORY FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="aircraft_id")
    private long aircraftId;  // PK for the aircraft

    // AIRCRAFT NAME
    @Column(name="aircraft_name")
    private String aircraftName;

    // AIRCRAFT MODEL
    @Column(name="aircraft_model")
    private String aircraftModel;

    // NOSE LANDING GEAR (NLG)
    @Column(name="nose_landing_gear")
    private String noseLandingGear;

    // RIGHT MAIN LANDING GEAR (RMLG)
    @Column(name="right_main_landing_gear")
    private String rightMainLandingGear;

    // LEFT MAIN LANDING GEAR (LMLG)
    @Column(name="left_main_landing_gear")
    private String leftMainLandingGear;

    // LEFT WING
    @Column(name="left_aircraft_wing")
    private String leftAircraftWing;

    // RIGHT WING
    @Column(name="right_aircraft_wing")
    private String rightAircraftWing;

    // RIGHT ELEVATOR
    @Column(name="right_aircraft_elevator")
    private String rightAircraftElevator;

    // LEFT ELEVATOR
    @Column(name="left_aircraft_elevator")
    private String leftAircraftElevator;

    // RUDDER
    @Column(name="aircraft_rudder")
    private String aircraftRudder;
}
