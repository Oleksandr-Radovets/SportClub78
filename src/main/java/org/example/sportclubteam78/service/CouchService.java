package org.example.sportclubteam78.service;

import org.example.sportclubteam78.dto.coachdto.CoachRequestCreateDto;
import org.example.sportclubteam78.model.Coach;

import java.util.List;

public interface CouchService {

    void deleteCoach(Long coachId);

    Coach createCouch(CoachRequestCreateDto couch);

    Coach findByEmail(String lastname);

    List<Coach> allCoach();

}
