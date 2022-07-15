package com.example.registrationlogintut.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@Getter
@Setter
@Entity
@Table(name="user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    /*unique constraints used for the email field for user table*/
    // FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstName, lastName, email, password;

    //one USER can have multiple ROLES
    // many-to-many mapping for user and role
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "user_roles",
        joinColumns = @JoinColumn(
                name = "user_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(
                name = "role_id", referencedColumnName = "id"))

    //
    private Collection<Role> roles;

    // EMPTY/NO ARGS CONSTRUCTOR
    public User() {
    }

    public User(String firstName, String lastName, String email, String password, Collection<Role> roles) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
}
