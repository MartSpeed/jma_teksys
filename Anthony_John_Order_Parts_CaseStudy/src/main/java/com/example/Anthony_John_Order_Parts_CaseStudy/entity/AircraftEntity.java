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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="aircraft")
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
    @Column(name="id")
    private int aircraftId;  // PK for the aircraft

    // requires a Nose Landing Gear
    // requires a Left Main Landing Gear
    // requires a Right Main Landing Gear
    @Column(name="landing_gear")
    private String landingGear;

    // requires a Left Wing
    // requires a Right Wing
    private String wing;

    // requires a Left Elevator
    // requires a Right Elevator
    private String elevator;

    private String rudder;

    // GETTERS/SETTERS START
    public int getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(int aircraftId) {
        this.aircraftId = aircraftId;
    }

    public String getLandingGear() {
        return landingGear;
    }

    public void setLandingGear(String landingGear) {
        this.landingGear = landingGear;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public String getElevator() {
        return elevator;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    public String getRudder() {
        return rudder;
    }

    public void setRudder(String rudder) {
        this.rudder = rudder;
    }
    // GETTERS/SETTERS END

    //TOSTRING
    @Override
    public String toString() {
        return "AircraftEntity{" +
                "aircraftId=" + aircraftId +
                ", landingGear='" + landingGear + '\'' +
                ", wing='" + wing + '\'' +
                ", elevator='" + elevator + '\'' +
                ", rudder='" + rudder + '\'' +
                '}';
    }
}
