package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RightWingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rightWingId;
}
