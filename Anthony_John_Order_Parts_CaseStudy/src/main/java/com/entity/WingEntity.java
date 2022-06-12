/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the wing entity will add the wing object to the aircraft
    object and will designate whether its a left wing or a right wing
*/
package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class WingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wingId; // PK for wing

    private String lWing; // designates the left wing
    private String rWing; // designates the right wing
}