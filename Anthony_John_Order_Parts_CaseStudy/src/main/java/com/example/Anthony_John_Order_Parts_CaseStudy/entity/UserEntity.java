package com.example.Anthony_John_Order_Parts_CaseStudy.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.Collection;

@Data
@Getter
@Setter
@Entity
@Table(name="user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class UserEntity {

    /*unique constraints used for the email field for the user table*/
    // FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String firstName, lastname, email, password;

    // one USER can have multiple ROLES
    // many-to-many mapping for user and role
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    // Collection of Roles for Users
    private Collection<Role> roles;

    //EMPTY/NO ARGS CONSTRUCTOR
    public UserEntity() {
    }

    public UserEntity(String firstName, String lastname, String email, String password, Collection<Role> roles) {
        super();
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
}
