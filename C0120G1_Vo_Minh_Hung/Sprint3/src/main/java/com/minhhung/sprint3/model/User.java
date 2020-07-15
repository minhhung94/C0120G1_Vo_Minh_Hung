package com.minhhung.sprint3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

    @JsonBackReference(value = "user")
    @OneToMany(mappedBy  = "user", cascade = CascadeType.ALL)
    private Set<Bills> bills;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Bills> getBills() {
        return bills;
    }

    public void setBills(Set<Bills> bills) {
        this.bills = bills;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
