package org.example.sportclubteam78.service;

import jakarta.annotation.PostConstruct;
import org.example.sportclubteam78.model.Coach;
import org.example.sportclubteam78.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CoachInitService {

    @Autowired
    private CoachRepository coachRepository;


    @PostConstruct
    private void initCoach() {
        Coach serhiy = new Coach(
                Long.valueOf(1),
                "Serhiy",
                "Antonovych",
                "mykola@gmail",
                "Yin Yoga, Tai Chi",
                "Serhiy has over 8 years of experience in personal" +
                        " training and athletic coaching. He began his career specializing " +
                        "in traditional yoga techniques and later incorporated" +
                        " Tai Chi into his practice.",
                "Serhiy has successfully guided clients in achieving mindfulness" +
                        " and flexibility through Yin Yoga practice combined with the Tai Chi.",
                1000,
                "man",
                27,
                "https://i.ibb.co/VVw6r0C/Serhiy-Antonovych.jpg",
                true);
        Coach daryna = new Coach(
                Long.valueOf(2),
                "Daryna",
                "Milovska",
                "daryna@gmail",
                "Hatha Yoga, Power Yoga, Stretch & Relax, Meditation",
                "      'Daryna is a certified yoga instructor with 4 years" +
                        " of experience. She started her career focusing on Hatha Yoga, expanding into" +
                        " Power Yoga to cater to clients seeking strength and flexibility.",
                "Daryna's expertise also includes leading Stretch & Relax sessions," +
                        " utilizing yoga props and therapeutic techniques for relaxation.",
                1000,
                "girl",
                23,
                "https://i.ibb.co/c6K4cjF/Daryna-Milovska.jpg",
                true
        );
        Coach natalia = new Coach(
                Long.valueOf(3),
                "Natalia ",
                "Voloshyna",
                "natalia@gmail",
                "HI-SIT (High-Intensity Sprint Interval Training)",
                "Natalia has 5 years of experience as a fitness instructor." +
                        " She began her career by developing " +
                        "specialized interval training programs tailored to individuals" +
                        " aiming for fitness goals.",
                "Natalia's coaching approach emphasizes dynamic workouts that" +
                        " combine sprint drills and interval training techniques.",
                1000,
                "girl",
                24,
                "https://i.ibb.co/y0hXpk9/Natalia-Voloshyna.jpg",
                true
        );

        Coach oleksandr = new Coach(
                Long.valueOf(4),
                "Oleksandr",
                "Koval",
                "oleksandr@gmail",
                "Interval Ride, Sprint Drills",
                "Oleksandr has 5 years of expertise in functional fitness and powerlifting." +
                        " He started his career focusing on Circuit Training," +
                        " designing comprehensive workout routines.",
                "Oleksandr's" +
                        " passion for strength and muscle development led him to" +
                        " specialize in Powerlifting.",
                1000,
                "man",
                30,
                "https://i.ibb.co/wQ3rM8w/Oleksandr-Koval.jpg",
                true
        );

        Coach andriy = new Coach(
                Long.valueOf(5),
                "Andriy ",
                "Tkachenko",
                "andriy@gmail",
                "Interval Ride, Sprint Drills",
                "Andriy is a CrossFit Level 2 Trainer with 4 years of experience. " +
                        "He began his career specializing " +
                        "in CrossFit methodology and transitioned " +
                        "into leading Interval Ride cycling classes.",
                "Andriy's coaching style emphasizes HIIT techniques" +
                        " with sprint drills to enhance speed, agility," +
                        " and athletic performance...",
                800,
                "man",
                24,
                "https://i.ibb.co/2YKJwhN/Andriy-Tkachenko.jpg",
                false
        );

        Coach yuliya = new Coach(
                Long.valueOf(6),
                "Yuliya ",
                "Shevchenko",
                "yuliya@gmail",
                "Hill Climb, Recovery Ride",
                "Yuliya is a certified Pilates instructor with 3 years of experience." +
                        " She started her career" +
                        " specializing in Pilates to promote core strength," +
                        " flexibility, and body alignment.",
                "She incorporates Recovery Ride sessions," +
                        " providing active recovery workouts enhancing" +
                        " circulation and muscle relaxation.",
                800,
                "girl",
                23,
                "https://i.ibb.co/vs51StY/Yuliya-Shevchenko.jpg",
                false
        );

        Coach roman = new Coach(
                Long.valueOf(7),
                "Roman",
                "Kovalenko",
                "roman@gmail",
                "HIIT (High-Intensity Interval Training), Aerobic Step",
                "Roman has 2 years of teaching experience. He began specializing " +
                        "in martial arts for self-defense and fitness," +
                        "later integrating HIIT workouts into his training programs." +
                        " She started her career" +
                        " specializing in Pilates to promote core strength," +
                        " flexibility, and body alignment.",
                "Roman's expertise also includes leading Aerobic Step classes," +
                        " utilizing step platforms to improve cardiovascular health.",
                800,
                "man",
                24,
                "https://i.ibb.co/nb5hHdX/Roman-Kovalenko.jpg",
                false
        );

        Coach olena = new Coach(
                Long.valueOf(8),
                "Olena",
                "Zakharach",
                "olena@gmail",
                "Kickboxing Cardio, Zumba",
                "Olena has 6 years of experience in fitness instruction." +
                        "She began her career by focusing on fitness strategies and later" +
                        " incorporated Kickboxing Cardio to promote cardiovascular health and stamina.",
                "She also leads Zumba sessions, using dance to" +
                        " enhance fitness and provide a fun, energetic workout.",
                800,
                "girl",
                29,
                "https://i.ibb.co/thKXgG2/Olena-Zakharach.jpg",
                false
        );
        List<Coach> allCoach = new ArrayList<>();
        allCoach.add(serhiy);
        allCoach.add(daryna);
        allCoach.add(natalia);
        allCoach.add(oleksandr);
        allCoach.add(andriy);
        allCoach.add(yuliya);
        allCoach.add(roman);
        allCoach.add(olena);
        coachRepository.saveAll(allCoach);
    }

}
