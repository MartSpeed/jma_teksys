/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the landinggear entity will have the landingGear onject
    information as well the Strings to determine if the landing gear will
    be nose, right main landing, or left main landing gear
*/
package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import javax.persistence.*;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NoseLandingGearEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long noseLandingGearId; // PK for landing gear

    // the total amount of the entity
    @Column
    private int quantity, availableAmount;

    // if quantity() !isAvailable() return false
    // if quantity() > isAvailable() return true
    @Column
    private String isAvailable;

}
