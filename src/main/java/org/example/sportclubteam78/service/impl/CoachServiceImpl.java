package org.example.sportclubteam78.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sportclubteam78.dto.coachdto.CoachRequestCreateDto;
import org.example.sportclubteam78.model.Coach;
import org.example.sportclubteam78.repository.CoachRepository;
import org.example.sportclubteam78.service.CouchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class CoachServiceImpl implements CouchService {

    public static String REGEX_TO_LINK = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

    @Autowired
    private CoachRepository couchRepository;

    @Override
    public void deleteCoach(Long coachId) {
        couchRepository.deleteById(coachId);
    }

    public Coach createCouch(CoachRequestCreateDto coach) {

        Coach coach1 = new Coach();
        coach1.setFirstname(coach.getFirstname());
        coach1.setLastname(coach.getLastname());
        coach1.setEmail(coach.getEmail());
        coach1.setSpeciality(coach.getSpeciality());
        coach1.setЕxpirience(coach.getЕxpirience());
        coach1.setAge(coach.getAge());
        coach1.setPrice(coach.getPrice());
        coach1.setGender(coach.getGender());
        boolean resultToLink = IsMatch(coach.getLinkToPhoto(), REGEX_TO_LINK);
        if (!resultToLink) {
            throw new RuntimeException("Your coach link is not correct");
        }
        coach1.setLinkToPhoto(coach.getLinkToPhoto());
        return couchRepository.save(coach1);
    }

    @Override
    public Coach findByEmail(String lastname) {
        return couchRepository.findByLastName(lastname).orElseThrow(() ->
                new RuntimeException("Couch Not Found"));
    }

    public void deleteCoachById(Long coachId) {
        couchRepository.deleteById(coachId);
    }

    public List<Coach> allCoach() {
       return couchRepository.findAll();
    }
    private boolean IsMatch(String s, String pattern) {
        try {
            Pattern patt = Pattern.compile(pattern);
            Matcher matcher = patt.matcher(s);
            return matcher.matches();
        } catch (RuntimeException e) {
            return false;
        }

    }
}
