package com.example.ex_hibernatetut.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
    @Id
    // this field will be set as the primary key(PK)
    // so HQL knows that it needs to treat the values of this field as the primary key
    private int userId;
    //
    private String userName;

    // GETTER/SETTER START
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    // GETTER/SETTER END
}
