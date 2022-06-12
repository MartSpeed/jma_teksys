/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the landinggear entity will have the landingGear onject
    information as well the Strings to determine if the landing gear will
    be nose, right main landing, or left main landing gear
*/
package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LandingGearEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int landingGearId; // PK for landing gear

    private String nlg; // designate to nose landing gear
    private String rMlg; // desinate to right main landing gear
    private String lMlg; // designate to left main landing gear
}
