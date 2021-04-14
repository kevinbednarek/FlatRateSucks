package com.hourtracker.HourTracker.service;

import com.hourtracker.HourTracker.domain.User;
import com.hourtracker.HourTracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.hourtracker.HourTracker.security.CustomSecurityUser;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user =  userRepo.findByUsername(username);

       if (user == null)
           throw new UsernameNotFoundException("Invalid username");

        return new CustomSecurityUser(user);

    }
}
