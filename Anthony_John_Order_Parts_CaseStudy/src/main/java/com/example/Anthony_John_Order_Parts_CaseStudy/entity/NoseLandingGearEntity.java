/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the landinggear entity will have the landingGear onject
    information as well the Strings to determine if the landing gear will
    be nose, right main landing, or left main landing gear
*/
package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NoseLandingGearEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long noseLandingGearId; // PK for landing gear
}
