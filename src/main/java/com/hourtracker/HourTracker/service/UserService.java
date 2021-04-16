package com.hourtracker.HourTracker.service;

import com.hourtracker.HourTracker.domain.User;
import com.hourtracker.HourTracker.repositories.UserRepository;
import com.hourtracker.HourTracker.security.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User save(User user){

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        Authority authority = new Authority();
        authority.setAuthority("ROLE_USER");
        authority.setUser(user);

        user.getAuthorities().add(authority);
        return userRepository.save(user);

    }
}
