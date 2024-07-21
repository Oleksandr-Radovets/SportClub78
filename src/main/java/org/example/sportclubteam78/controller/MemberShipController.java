package org.example.sportclubteam78.controller;

import org.example.sportclubteam78.model.MemberShip;
import org.example.sportclubteam78.service.MemberShipService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberShipController {
    private MemberShipService memberShipService;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')" )
    @PostMapping("/create")
    public MemberShip createMemberShip(@RequestBody MemberShip memberShip) {
        return memberShipService.createMemberShip(memberShip);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')" )
    @GetMapping("/{Id}")
    public MemberShip findById(@RequestParam Long id) {
        return memberShipService.findMemberShipById(id);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')" )
    @GetMapping("/all")
    public List<MemberShip> findAll() {
        return memberShipService.findAllMemberShips();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')" )
    @DeleteMapping("/{id}")
    public void deleteMemberShip(@RequestParam Long id) {
         memberShipService.deleteMemberShip(id);
    }


}
