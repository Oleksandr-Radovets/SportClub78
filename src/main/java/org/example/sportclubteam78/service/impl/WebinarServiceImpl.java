package org.example.sportclubteam78.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sportclubteam78.dto.webinardto.WebinarRequestDto;
import org.example.sportclubteam78.model.Coach;
import org.example.sportclubteam78.model.User;
import org.example.sportclubteam78.model.Webinar;
import org.example.sportclubteam78.repository.CoachRepository;
import org.example.sportclubteam78.repository.UserRepository;
import org.example.sportclubteam78.repository.WebinarRepository;
import org.example.sportclubteam78.service.WebinarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WebinarServiceImpl implements WebinarService {

    @Autowired
    private WebinarRepository webinarRepository;
    @Autowired
    private CoachRepository coachRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Webinar createWebinar(WebinarRequestDto webinar) {
        Coach coach = coachRepository.findByLastName(webinar.getLastNameCouch()).orElseThrow(() -> new RuntimeException("Coach not found"));
        Webinar webinar1 = new Webinar();
        webinar1.setName(webinar.getName());
        webinar1.setLocation(webinar.getLocation());
        webinar1.setStudio(webinar.getStudio());
        webinar1.setCouch(coach);
        webinar1.setTime(webinar.getTime());
        webinar1.setHard(webinar.getHard());
        webinar1.setCapacity(webinar.getCapacity());
        webinar1.setDate(webinar.getDate());
        return webinarRepository.save(webinar1);
    }

    @Override
    public List<Webinar> allWebinars() {
        List<Webinar> all = webinarRepository.findAll();
        return all;
    }

    @Override
    public Webinar upadateWebinar(Long id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        User user = userRepository.findByEmail(name).get();
        Webinar webinar = webinarRepository.findById(id).orElseThrow(()
                -> new RuntimeException("this webinar not found"));
        List<User> users = webinar.getUsers();
        boolean contains = users.contains(user);
        if (contains || users.size() >= webinar.getCapacity()) {
            throw new RuntimeException("User already exists");
        }
        webinar.getUsers().add(user);
        webinarRepository.save(webinar);
        return webinar;
    }

    @Override
    public void deleteWebinar(Long id) {
        webinarRepository.deleteById(id);
    }

}


