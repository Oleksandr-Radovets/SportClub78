package org.example.sportclubteam78.security;


import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.example.sportclubteam78.dto.userdto.UserLoginRequestDto;
import org.example.sportclubteam78.dto.userdto.UserLoginResponseTokenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AuthenticationService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    AuthenticationManager authenticationManager;

@NotNull
    public UserLoginResponseTokenDto authenticate(UserLoginRequestDto userLoginRequestDto) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(userLoginRequestDto.getEmail(),
                        userLoginRequestDto.getPassword()));
        String token = jwtUtil.generateToken(authentication.getName());
        return new UserLoginResponseTokenDto(token);
    }

}
