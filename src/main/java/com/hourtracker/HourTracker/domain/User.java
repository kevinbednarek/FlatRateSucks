package com.hourtracker.HourTracker.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String employer;
    private String payScale;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getPayScale() {
        return payScale;
    }

    public void setPayScale(String payScale) {
        this.payScale = payScale;
    }
}
