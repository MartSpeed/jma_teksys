package com.example.ex_hibernatetut.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="USER_DETAILS")
public class UserDetails {
    @Id
    @Column (name="USER_ID")
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

    @Column (name="USER_NAME")
    public String getUserName() {
        return userName + " at getter";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    // GETTER/SETTER END
}
