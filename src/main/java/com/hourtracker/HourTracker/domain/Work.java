package com.hourtracker.HourTracker.domain;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity

public class Work {

    private workId id;
    private int repairOrder;
    private Float hours;
    private Boolean rate;
    private Boolean paid;
    private LocalDate date;
    private User user;

    @EmbeddedId
    public workId getId() {
        return id;
    }

    public int getRepairOrder() {
        return repairOrder;
    }

    public void setRepairOrder(int repairOrder) {
        this.repairOrder = repairOrder;
    }

    public void setId(workId id) {
        this.id = id;
    }

    public Float getHours() {
        return hours;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }

    public Boolean getRate() {
        return rate;
    }

    public void setRate(Boolean rate) {
        this.rate = rate;
    }

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

    public User getUser() {
        return user;
    }

    @ManyToOne
    public void setUser(User user) {
        this.user = user;
    }
}
