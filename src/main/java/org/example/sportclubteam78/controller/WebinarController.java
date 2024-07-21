package org.example.sportclubteam78.controller;

import lombok.RequiredArgsConstructor;
import org.example.sportclubteam78.dto.webinardto.WebinarRequestDto;
import org.example.sportclubteam78.model.Webinar;
import org.example.sportclubteam78.service.WebinarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/webinar")
public class WebinarController {

    @Autowired
    private WebinarService webinarService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/create")
    public Webinar createWebinar(@RequestBody WebinarRequestDto webinarRequestDto){
      return   webinarService.createWebinar(webinarRequestDto);
    }

    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @GetMapping("/all")
    public List<Webinar> allWebinars() {
        return webinarService.allWebinars();
    }

    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @PutMapping("/{id}")
    public Webinar updateWebinar(@RequestParam Long id){
        return webinarService.upadateWebinar(id);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("del/{id}")
   public void deleteWebinar(@RequestParam Long id){
        webinarService.deleteWebinar(id);
   }

}
