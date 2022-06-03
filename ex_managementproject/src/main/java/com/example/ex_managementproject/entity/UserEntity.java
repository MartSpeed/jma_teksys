package com.example.ex_managementproject.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String user_name;

    // set the description to be a minimum of 10 - 15 characters
    @Size(min=15, message = "Enter at least 15 characters please.")
    private String user_description;

    // target the date this user was created
    // Date from the java util
    private Date target_date;

    // empty constructor
    public UserEntity(){

    }

    public UserEntity(Long user_id, String user_name, String user_description, Date target_date) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_description = user_description;
        this.target_date = target_date;
    }

    public UserEntity(String user_name, String user_description, Date target_date) {
        this.user_name = user_name;
        this.user_description = user_description;
        this.target_date = target_date;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_description() {
        return user_description;
    }

    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }

    public Date getTarget_date() {
        return target_date;
    }

    public void setTarget_date(Date target_date) {
        this.target_date = target_date;
    }
}
