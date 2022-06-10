/*  AUTHOR: John Anthony
    DATE: 20220610
    DESCRIPTION: the aircraft will inform the user if the aircraft is in need of maintenance or not.
    this class will hold the aircraft objects:
    landing gear entity,
    elevator entity,
    rudder entity,
    wing entity
*/

package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

public class AircraftEntity {

    /*
        what does your aircraft need to be whole?
    */

    // AIRCRAFT FIELDS
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
