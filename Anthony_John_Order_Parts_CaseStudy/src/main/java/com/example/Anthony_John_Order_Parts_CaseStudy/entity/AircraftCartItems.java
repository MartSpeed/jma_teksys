package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name="cart_items")
public class AircraftCartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    // reference to aircraft product
    // product can be added to cart items more than once
    @ManyToOne
    @JoinColumn(name="aircraft_product_id")
    private AircraftProduct aircraftProduct;

    //reference to the user
    // user can add one more items in the aircraft cart
    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity userEntity;

    // quantity of the product
    private int quantity;

    //NO ARGS/ALL ARGS CONSTRUCT
    public AircraftCartItems() {
    }
    public AircraftCartItems(AircraftProduct aircraftProduct, UserEntity userEntity, int quantity) {
        this.aircraftProduct = aircraftProduct;
        this.userEntity = userEntity;
        this.quantity = quantity;
    }
}
