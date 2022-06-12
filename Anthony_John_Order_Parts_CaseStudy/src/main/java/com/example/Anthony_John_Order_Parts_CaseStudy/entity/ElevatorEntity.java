/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the elevator hold the id number for each elevator object
*/

package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class ElevatorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int elevatorId; // PK for elevator

    private String lElevator; // designate letf elevator
    private String rElevator; // designate right elevator
}
