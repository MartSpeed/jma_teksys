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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long aircraftId;  // PK for the aircraft

    // AIRCRAFT NAME
    @Column
    private String aircraftName;

    // AIRCRAFT MODEL
    @Column
    private String aircraftModel;

//    // NOSE LANDING GEAR (NLG)
//    @ManyToOne
//    @JoinColumn(name="nose_landing_gear")
//    private NoseLandingGearEntity nLg;
//
//    // RIGHT MAIN LANDING GEAR (RMLG)
//    @ManyToOne
//    @JoinColumn(name="right_main_landing_gear")
//    private RightMainLandingGearEntity rMlg;
//
//    // LEFT MAIN LANDING GEAR (LMLG)
//    @ManyToOne
//    @JoinColumn(name="left_main_landing_gear")
//    private LeftMainLandingGearEntity lMlg;
//
//    // LEFT WING
//    @ManyToOne
//    @JoinColumn(name="left_aircraft_wing")
//    private LeftWingEntity lWing;
//
//    // RIGHT WING
//    @ManyToOne
//    @JoinColumn(name="right_aircraft_wing")
//    private RightWingEntity rWing;
//
//    // RIGHT ELEVATOR
//    @ManyToOne
//    @JoinColumn(name="right_aircraft_elevator")
//    private RightElevatorEntity rElevator;
//
//    // LEFT ELEVATOR
//    @ManyToOne
//    @JoinColumn(name="left_aircraft_elevator")
//    private LeftElevatorEntity lElevator;
//
//    // RUDDER
//    @ManyToOne
//    @JoinColumn(name="aircraft_rudder")
//    private RudderEntity rudder;
}
