package org.example.sportclubteam78.controller;


import org.example.sportclubteam78.model.DataCart;
import org.example.sportclubteam78.service.DateCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cart")
public class DataCartController {

    @Autowired
    private DateCartService dateCartService;

    @PreAuthorize("hasRole('ROLE_USER')" )
    @PostMapping("/create")
    public String createDateCart(DataCart dataCart) {
        return dateCartService.createDateCart(dataCart);
    }
    @PreAuthorize("hasRole('ROLE_USER')" )
    @DeleteMapping("delete")
    public void deleteDateCart(Long id) {
        dateCartService.deleteDateCart(id);
    }

}
