package org.example.sportclubteam78.repository;

import org.example.sportclubteam78.model.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CoachRepository extends JpaRepository<Coach, Long> {
    @Query(value = "SELECT * FROM coach WHERE lastname = ?", nativeQuery = true)
    Optional<Coach> findByLastName(@Param("lastname") String lastname);

    void deleteCoachById(Long coachId);
}
