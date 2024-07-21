package org.example.sportclubteam78.service;

import org.example.sportclubteam78.dto.userdto.UserRegisterRequestDto;
import org.example.sportclubteam78.dto.userdto.UserResponseDto;
import org.example.sportclubteam78.exeption.RegistrationException;

import java.util.List;


public interface UserService {
    UserResponseDto register(UserRegisterRequestDto userDto) throws RegistrationException;

    UserResponseDto findByEmail(String email);

    List<UserResponseDto> allUsers ();

    UserResponseDto findUserById(Long id);

    void deleteUserById(Long id);

}
