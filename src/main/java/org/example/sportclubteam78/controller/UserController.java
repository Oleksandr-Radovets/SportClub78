package org.example.sportclubteam78.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.sportclubteam78.dto.userdto.UserLoginRequestDto;
import org.example.sportclubteam78.dto.userdto.UserLoginResponseTokenDto;
import org.example.sportclubteam78.dto.userdto.UserRegisterRequestDto;
import org.example.sportclubteam78.dto.userdto.UserResponseDto;
import org.example.sportclubteam78.exeption.RegistrationException;
import org.example.sportclubteam78.model.User;
import org.example.sportclubteam78.repository.UserRepository;
import org.example.sportclubteam78.security.AuthenticationService;
import org.example.sportclubteam78.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Tag(name = "user management", description = "Endpoints for managing users")
@RestController
@RequiredArgsConstructor
@RequestMapping()
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public UserLoginResponseTokenDto login(@RequestBody UserLoginRequestDto userLoginRequestDto) {
        return authenticationService.authenticate(userLoginRequestDto);
    }

    @Operation(summary = "create new user", description = "create new user")
    @PostMapping("/register")
    public UserResponseDto registration(@Valid @RequestBody UserRegisterRequestDto userDto) throws RegistrationException {
        return userService.register(userDto);
    }

    @Operation(summary = "find email", description = "find email")
    @GetMapping("/findByEmail{email}")
    public UserResponseDto findUserByEmail(@Param(value = "email") String email) {
        return userService.findByEmail(email);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Operation(summary = "all list users", description = "all list users")
    @GetMapping("/all")
    public List<UserResponseDto> findAllUsers() {
        return userService.allUsers();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Operation(summary = "user by id", description = "user by id")
    @GetMapping("user/{id}")
    private UserResponseDto getUserById(@RequestParam(value = "id", required = false) Long id) {
        return userService.findUserById(id);
    }
}
