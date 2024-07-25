package org.example.sportclubteam78.controller;

import lombok.RequiredArgsConstructor;
import org.example.sportclubteam78.dto.coachdto.CoachRequestCreateDto;
import org.example.sportclubteam78.model.Coach;
import org.example.sportclubteam78.service.CouchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coach")
@RequiredArgsConstructor
public class CouchController {

    @Autowired
    private CouchService couchService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/create")
    public Coach create (@RequestBody CoachRequestCreateDto couch) {
        return couchService.createCouch(couch);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')" )
    @GetMapping("/find")
    public Coach find (@RequestParam String lastname) {
       return couchService.findByEmail(lastname);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')" )
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping("del/{id}")
    public void deleteCouch (@RequestParam Long couchId) {
        couchService.deleteCoach(couchId);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')" )
    @GetMapping("/all")
    public List<Coach> getAllCoach () {
        return couchService.allCoach();
    }
}
