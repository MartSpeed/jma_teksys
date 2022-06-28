package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table
public class AircraftProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private String mainImage;
    @Column
    private boolean inStock;
    @Column
    private float price;

    // main image path
    public String getMainImagePath(){
        if(mainImage == null || id == null) return null;
        return "/product-images/" + id + "/" + mainImage;
    }

    //NO ARGS/ALL ARGS
    public AircraftProduct() {
    }
    public AircraftProduct(Integer id, String name, String mainImage, boolean inStock, float price) {
        this.id = id;
        this.name = name;
        this.mainImage = mainImage;
        this.inStock = inStock;
        this.price = price;
    }
}
