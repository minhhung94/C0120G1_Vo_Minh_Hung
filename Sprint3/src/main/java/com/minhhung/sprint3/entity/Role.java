package com.minhhung.sprint3.entity;

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
    private Set<UserRole> roleUsers;

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", nameRole='" + nameRole + '\'' +
                ", roleUsers=" + roleUsers +
                '}';
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

    public Set<UserRole> getRoleUsers() {
        return roleUsers;
    }

    public void setRoleUsers(Set<UserRole> roleUsers) {
        this.roleUsers = roleUsers;
    }
}
