package org.example.sportclubteam78.dto.webinardto;

import jakarta.persistence.*;
import org.example.sportclubteam78.model.Coach;
import org.example.sportclubteam78.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class  WebinarRequestDto {
    private String name;
    private String location;
    private String studio;
    private String lastNameCouch;
    private String  time;
    private String date;
    private String hard;
    private List<User> users = new ArrayList<>(getCapacity());
    private int capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getLastNameCouch() {
        return lastNameCouch;
    }

    public void setLastNameCouch(String lastNameCouch) {
        this.lastNameCouch = lastNameCouch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHard() {
        return hard;
    }

    public void setHard(String hard) {
        this.hard = hard;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
