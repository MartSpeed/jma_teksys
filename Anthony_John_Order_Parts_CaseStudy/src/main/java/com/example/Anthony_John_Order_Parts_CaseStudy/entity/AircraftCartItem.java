package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name="aircraft_cart_items")
public class AircraftCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="aircraft_product_id")
    private AircraftProduct aircraftProduct;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity userEntity;

    private int quantity;

    //ALL ARGS/NO ARGS
    public AircraftCartItem() {
    }

    public AircraftCartItem(AircraftProduct aircraftProduct, UserEntity userEntity, int quantity) {
        this.aircraftProduct = aircraftProduct;
        this.userEntity = userEntity;
        this.quantity = quantity;
    }
}
