package org.example.sportclubteam78.service;

import org.example.sportclubteam78.model.MemberShip;

import java.util.List;

public interface MemberShipService {

    MemberShip createMemberShip(MemberShip memberShip);

    MemberShip findMemberShipById(Long membershipId);

    List<MemberShip> findAllMemberShips();

    void deleteMemberShip(Long membershipId);
}
