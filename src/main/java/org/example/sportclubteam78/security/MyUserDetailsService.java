package org.example.sportclubteam78.security;

import org.example.sportclubteam78.model.User;
import org.example.sportclubteam78.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    private UserDetailsService userDetailsService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found by username: " + username));
        return user;
///////////////////////////////////////////////
//        AuthenticationManager authenticationManager = new AuthenticationManager() {
//            @Override
//            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//                return new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
//            }
//        };
//        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authenticate);
//        Object principal = (String)authenticate.getPrincipal();
//////////////////////////////////////////////////////////////////////
    }
}