package com.hourtracker.HourTracker.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity

public class Work {


    private Integer id;
    private Integer repairOrder;
    private Float hours;
    //private Boolean rate; Not using this right now
    private Boolean paid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String description;
    private User user; //Would like a user object, but may be able to use the embedded id in work for user id.

//Changing from @EmbeddedId and adding user.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Does this work? Do you generate your own value, or do you need one for user?
    public Integer getId() {
        return id;
    }

    public Integer getRepairOrder() {
        return repairOrder;
    }

    public void setRepairOrder(Integer repairOrder) {
        this.repairOrder = repairOrder;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getHours() {
        return hours;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }

    /*public Boolean getRate() {
        return rate;
    }

    public void setRate(Boolean rate) {
        this.rate = rate;
    }*/ //not using this right now

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", repairOrder=" + repairOrder +
                ", hours=" + hours +
               // ", rate=" + rate + not using this right now
                ", paid=" + paid +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
