package org.example.sportclubteam78.mapper;


import org.example.sportclubteam78.config.MapperConfig;
import org.example.sportclubteam78.dto.userdto.UserRegisterRequestDto;
import org.example.sportclubteam78.dto.userdto.UserResponseDto;
import org.example.sportclubteam78.model.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(config = MapperConfig.class)
public interface UserMapper {

    UserResponseDto userToUserResponseDto(User user);

    User toUser (UserRegisterRequestDto user);
}
