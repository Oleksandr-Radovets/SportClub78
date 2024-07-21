package org.example.sportclubteam78.service.impl;

import org.example.sportclubteam78.model.MemberShip;
import org.example.sportclubteam78.repository.MemberShipRepository;
import org.example.sportclubteam78.service.MemberShipService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MemberShipServiceImpl implements MemberShipService {
    private MemberShipRepository memberShipRepository;
    @Override
    public MemberShip createMemberShip(MemberShip memberShip) {
        return  memberShipRepository.save(memberShip);
    }

    @Override
    public MemberShip findMemberShipById(Long membershipId) {
        return memberShipRepository.findById(membershipId).orElseThrow(()->
                new RuntimeException("MemberShip not found"));
    }

    @Override
    public List<MemberShip> findAllMemberShips() {
        return memberShipRepository.findAll();
    }

    @Override
    public void deleteMemberShip(Long membershipId) {
        memberShipRepository.deleteById(membershipId);
    }
}
