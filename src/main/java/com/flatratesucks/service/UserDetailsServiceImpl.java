package com.flatratesucks.service;

import com.flatratesucks.domain.User;
import com.flatratesucks.repositories.UserRepository;
import com.flatratesucks.security.CustomSecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
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
