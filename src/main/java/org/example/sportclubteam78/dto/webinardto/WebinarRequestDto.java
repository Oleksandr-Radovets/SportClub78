package org.example.sportclubteam78.dto.webinardto;

import java.time.LocalDateTime;

public class  WebinarRequestDto {

    private String nameWebinar;
    private String nameLocation;
    private String lastNameCoach;
    private String dateWebinar;
    private int hardTrening;

   private int capacityVisitors;

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

    public String getLastNameCoach() {
        return lastNameCoach;
    }

    public void setLastNameCoach(String lastNameCoach) {
        this.lastNameCoach = lastNameCoach;
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

    public int getCapacityVisitors() {
        return capacityVisitors;
    }

    public void setCapacityVisitors(int capacityVisitors) {
        this.capacityVisitors = capacityVisitors;
    }
}
