package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LeftMainLandingGear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leftMainLandingGearId;
}
