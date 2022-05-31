package com.example.ex_my_spring_data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // declares our class object an entity for the database to be able to read from
public class UserEntity {
    @Id // AUTO_COMPLETE for user ID's
    @GeneratedValue(stategy = GenerationType.IDENTITY) // same thing
    private Integer id;

    // FIELDS that we will use to obtain and create data with
    private String name, email;

    //  GETTERS/SETTERS START
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //  GETTERS/SETTERS END
}
