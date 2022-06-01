package com.example.jma_my_spring_data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // tell our POJO that its a DB item and allows it to read DB commands??? I know its needed...
public class StateEntity {
    @Id // used for auto-incrementing
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int state_id;

    private String name;
    private String capitol;

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitol() {
        return capitol;
    }

    public void setCapitol(String capitol) {
        this.capitol = capitol;
    }
}
