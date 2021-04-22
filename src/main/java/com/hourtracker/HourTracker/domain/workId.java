package com.hourtracker.HourTracker.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

//@Embeddable
public class workId implements Serializable {

    private static final long serialVersionUID = -8355867264578779074L;
    private User user;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
