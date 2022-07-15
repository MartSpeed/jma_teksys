package com.example.registrationlogintut.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {
    // FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;


    public Role(String name) {
        super();
        this.name = name;
    }
}
