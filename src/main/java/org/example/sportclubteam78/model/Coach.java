package org.example.sportclubteam78.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    @Column(length = 500)
    private String speciality;
    @Column(length = 500)
    private String еxpirience;
    private String experiencetwo;
    private int price;
    private String gender;
    private int age;
    private String linkToPhoto;

    public String getExperiencetwo() {
        return experiencetwo;
    }

    public void setExperiencetwo(String experiencetwo) {
        this.experiencetwo = experiencetwo;
    }

    public boolean isTop() {
        return isTop;
    }

    public void setTop(boolean top) {
        isTop = top;
    }

    private boolean isTop;

    public Coach() {
    }

    public Coach(
            Long id,
            String firstname,
            String lastname,
            String email,
            String speciality,
            String еxpirience,
            String experiencetwo,
            int price,
            String gender,
            int age,
            String linkToPhoto,
            boolean isTop) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.speciality = speciality;
        this.еxpirience = еxpirience;
        this.experiencetwo = experiencetwo;
        this.price = price;
        this.gender = gender;
        this.age = age;
        this.linkToPhoto = linkToPhoto;
        this.isTop = isTop;
    }

    public String getLinkToPhoto() {
        return linkToPhoto;
    }


    public void setLinkToPhoto(String linkToPhoto) {
        this.linkToPhoto = linkToPhoto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getЕxpirience() {
        return еxpirience;
    }

    public void setЕxpirience(String еxpirience) {
        this.еxpirience = еxpirience;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
