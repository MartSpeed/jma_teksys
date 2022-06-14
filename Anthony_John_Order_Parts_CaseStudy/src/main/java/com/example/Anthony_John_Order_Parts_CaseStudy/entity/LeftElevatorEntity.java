package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LeftElevatorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leftElevatorId;
}
