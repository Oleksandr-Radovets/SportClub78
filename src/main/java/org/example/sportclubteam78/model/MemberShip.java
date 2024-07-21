package org.example.sportclubteam78.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MemberShip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String duration;
    private String data;
    private String giveOne;
    private String giveTwo;
    private String giveThree;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGiveOne() {
        return giveOne;
    }

    public void setGiveOne(String giveOne) {
        this.giveOne = giveOne;
    }

    public String getGiveTwo() {
        return giveTwo;
    }

    public void setGiveTwo(String giveTwo) {
        this.giveTwo = giveTwo;
    }

    public String getGiveThree() {
        return giveThree;
    }

    public void setGiveThree(String giveThree) {
        this.giveThree = giveThree;
    }
}
