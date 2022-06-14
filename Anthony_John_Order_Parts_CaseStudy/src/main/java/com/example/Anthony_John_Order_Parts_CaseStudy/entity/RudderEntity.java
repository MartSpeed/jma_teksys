/*  AUTHOR: John Anthony
    DATE: 20220611
    DESCRIPTION: the rudder entity hold the id number for the rudder object

    ??? is this all that I need to make this object and connect it to the
    aircraft object.
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RudderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rudderId; // PK for rudder

}
