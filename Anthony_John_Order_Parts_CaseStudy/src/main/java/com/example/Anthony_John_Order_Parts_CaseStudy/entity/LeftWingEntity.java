/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the wing entity will add the wing object to the aircraft
    object and will designate whether its a left wing or a right wing
*/
package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LeftWingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leftWingId; // PK for wing
}
