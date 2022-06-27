package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="role")
public class RoleEntity {
    // FIELDS
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    public RoleEntity(String name) {
        super();
        this.name = name;
    }
}
