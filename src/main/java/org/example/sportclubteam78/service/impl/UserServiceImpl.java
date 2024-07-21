package org.example.sportclubteam78.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sportclubteam78.dto.userdto.UserRegisterRequestDto;
import org.example.sportclubteam78.dto.userdto.UserResponseDto;
import org.example.sportclubteam78.exeption.PasswordValidatorException;
import org.example.sportclubteam78.mapper.UserMapper;
import org.example.sportclubteam78.model.User;
import org.example.sportclubteam78.repository.UserRepository;
import org.example.sportclubteam78.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResponseDto register(UserRegisterRequestDto userDto) {
        User user = userMapper.toUser(userDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User save1 = userRepository.save(user);
        UserResponseDto dto = userMapper.userToUserResponseDto(save1);
        return dto;
    }

    public UserResponseDto findByEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(()
                        -> new UsernameNotFoundException("this User is not found by email" + email));
        return userMapper.userToUserResponseDto(user);
    }

    public List<UserResponseDto> allUsers() {
        return userRepository.findAll().stream().map(userMapper::userToUserResponseDto).toList();
    }

    public UserResponseDto findUserById(Long id) {
        return userMapper.userToUserResponseDto(userRepository.findById(id)
                .orElseThrow(() ->
                        new UsernameNotFoundException("this User is not found by id" + id)));
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
