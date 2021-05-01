package com.hourtracker.HourTracker.domain;

import com.hourtracker.HourTracker.security.Authority;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String employer;
    private Set<Authority> authorities = new HashSet<>();
    private Set<Work> jobs = new HashSet<>(); //added this to crate many jobs for one user. May be wrong.

    @OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER, mappedBy = "user")
    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
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

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Work> getJobs() {
        return jobs;
    }

    public void setJobs(Set<Work> jobs) {
        this.jobs = jobs;
    }
}
