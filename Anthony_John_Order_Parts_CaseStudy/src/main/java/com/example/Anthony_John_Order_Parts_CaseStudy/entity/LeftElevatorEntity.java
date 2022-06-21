package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LeftElevatorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String partName;

    @Column
    private int quantity;

    @Column
    private int availableAmount;

    // if quantity() !isAvailable() return false
    // if quantity() > isAvailable() return true
    @Column
    private String isAvailable;

    private String type;

}
