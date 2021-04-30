package com.hourtracker.HourTracker.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Work {


    private Integer id;
    private Integer repairOrder;
    private Float hours;
    private Float hours2;
    private Float hours3;
    private Float hours4;
    private Float hours5;
    private Float hours6;
    private Float hours7;
    private Float hours8;
    private Float hours9;
    private Float hours10;
    //private Boolean rate; Not using this right now
    private Boolean paid;
    //private Boolean paid2; switched to paid for entire ticket, not per line.
    //private Boolean paid3;
    //private Boolean paid4;
    //private Boolean paid5;
    //private Boolean paid6;
    //private Boolean paid7;
    //private Boolean paid8;
    //private Boolean paid9;
    //private Boolean paid10;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String description;
    private String description2;
    private String description3;
    private String description4;
    private String description5;
    private String description6;
    private String description7;
    private String description8;
    private String description9;
    private String description10;
    private String advisor;

    private User user;
    //private Set<TicketLine> ticketLines = new HashSet<>(); not using this, previous attempt

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
                //", rate=" + rate + //not using this right now
                ", paid=" + paid +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }

    public Float getHours2() {
        return hours2;
    }

    public void setHours2(Float hours2) {
        this.hours2 = hours2;
    }

    public Float getHours3() {
        return hours3;
    }

    public void setHours3(Float hours3) {
        this.hours3 = hours3;
    }

    public Float getHours4() {
        return hours4;
    }

    public void setHours4(Float hours4) {
        this.hours4 = hours4;
    }

    public Float getHours5() {
        return hours5;
    }

    public void setHours5(Float hours5) {
        this.hours5 = hours5;
    }

    public Float getHours6() {
        return hours6;
    }

    public void setHours6(Float hours6) {
        this.hours6 = hours6;
    }

    public Float getHours7() {
        return hours7;
    }

    public void setHours7(Float hours7) {
        this.hours7 = hours7;
    }

    public Float getHours8() {
        return hours8;
    }

    public void setHours8(Float hours8) {
        this.hours8 = hours8;
    }

    public Float getHours9() {
        return hours9;
    }

    public void setHours9(Float hours9) {
        this.hours9 = hours9;
    }

    public Float getHours10() {
        return hours10;
    }

    public void setHours10(Float hours10) {
        this.hours10 = hours10;
    }

    /*public Boolean getPaid2() {
        return paid2;
    }

    public void setPaid2(Boolean paid2) {
        this.paid2 = paid2;
    }

    public Boolean getPaid3() {
        return paid3;
    }

    public void setPaid3(Boolean paid3) {
        this.paid3 = paid3;
    }

    public Boolean getPaid4() {
        return paid4;
    }

    public void setPaid4(Boolean paid4) {
        this.paid4 = paid4;
    }

    public Boolean getPaid5() {
        return paid5;
    }

    public void setPaid5(Boolean paid5) {
        this.paid5 = paid5;
    }

    public Boolean getPaid6() {
        return paid6;
    }

    public void setPaid6(Boolean paid6) {
        this.paid6 = paid6;
    }

    public Boolean getPaid7() {
        return paid7;
    }

    public void setPaid7(Boolean paid7) {
        this.paid7 = paid7;
    }

    public Boolean getPaid8() {
        return paid8;
    }

    public void setPaid8(Boolean paid8) {
        this.paid8 = paid8;
    }

    public Boolean getPaid9() {
        return paid9;
    }

    public void setPaid9(Boolean paid9) {
        this.paid9 = paid9;
    }

    public Boolean getPaid10() {
        return paid10;
    }

    public void setPaid10(Boolean paid10) {
        this.paid10 = paid10;
    }*/

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getDescription4() {
        return description4;
    }

    public void setDescription4(String description4) {
        this.description4 = description4;
    }

    public String getDescription5() {
        return description5;
    }

    public void setDescription5(String description5) {
        this.description5 = description5;
    }

    public String getDescription6() {
        return description6;
    }

    public void setDescription6(String description6) {
        this.description6 = description6;
    }

    public String getDescription7() {
        return description7;
    }

    public void setDescription7(String description7) {
        this.description7 = description7;
    }

    public String getDescription8() {
        return description8;
    }

    public void setDescription8(String description8) {
        this.description8 = description8;
    }

    public String getDescription9() {
        return description9;
    }

    public void setDescription9(String description9) {
        this.description9 = description9;
    }

    public String getDescription10() {
        return description10;
    }

    public void setDescription10(String description10) {
        this.description10 = description10;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    /*@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="work")
    public Set<TicketLine> getTicketLines() {
        return ticketLines;
    }

    public void setTicketLines(Set<TicketLine> ticketLines) {
        this.ticketLines = ticketLines;
    }*/
}
