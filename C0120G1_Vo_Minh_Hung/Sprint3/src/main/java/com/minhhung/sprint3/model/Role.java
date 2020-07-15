package com.minhhung.sprint3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Integer id;

    @Column(name = "name_role")
    private String nameRole;

    @JsonBackReference(value = "role")
    @OneToMany(mappedBy  = "role", cascade = CascadeType.ALL)
    private Set<User> User;

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public Set<com.minhhung.sprint3.model.User> getUser() {
        return User;
    }

    public void setUser(Set<com.minhhung.sprint3.model.User> user) {
        User = user;
    }
}
