package org.example.sportclubteam78.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Webinar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameWebinar;
    private String nameLocation;
    @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Coach couch;
    private String  dateWebinar;
    private int hardTrening;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column(unique = true)
    private List<User> users = new ArrayList<>(getCapacityVisitors());

    private int capacityVisitors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameWebinar() {
        return nameWebinar;
    }

    public void setNameWebinar(String nameWebinar) {
        this.nameWebinar = nameWebinar;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    public Coach getCouch() {
        return couch;
    }

    public void setCouch(Coach couch) {
        this.couch = couch;
    }

    public String getDateWebinar() {
        return dateWebinar;
    }

    public void setDateWebinar(String dateWebinar) {
        this.dateWebinar = dateWebinar;
    }

    public int getHardTrening() {
        return hardTrening;
    }

    public void setHardTrening(int hardTrening) {
        this.hardTrening = hardTrening;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getCapacityVisitors() {
        return capacityVisitors;
    }

    public void setCapacityVisitors(int capacityVisitors) {
        this.capacityVisitors = capacityVisitors;
    }
}
