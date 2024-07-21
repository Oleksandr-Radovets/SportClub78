package org.example.sportclubteam78.service;

import org.example.sportclubteam78.dto.webinardto.WebinarRequestDto;
import org.example.sportclubteam78.model.Webinar;

import java.util.List;

public interface WebinarService {

    Webinar createWebinar(WebinarRequestDto webinarRequestDto);

    List<Webinar> allWebinars ();

    Webinar upadateWebinar(Long id);

     void deleteWebinar(Long id);
}
