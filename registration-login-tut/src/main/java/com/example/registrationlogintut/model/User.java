package com.example.registrationlogintut.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private Collection<Role> roles;

    public <T> User(String firstName, String lastName, String email, String password, List<T> role_user) {
    }
}
