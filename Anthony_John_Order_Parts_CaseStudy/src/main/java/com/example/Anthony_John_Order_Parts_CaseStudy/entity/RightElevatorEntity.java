/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the elevator hold the id number for each elevator object
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
public class RightElevatorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rightElevatorId; // PK for elevator
}
