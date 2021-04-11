package com.hourtracker.HourTracker.domain;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity

public class Work {

    private workId id;
    private Float hours;
    private Boolean rate;

    @EmbeddedId
    public workId getId() {
        return id;
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
}
