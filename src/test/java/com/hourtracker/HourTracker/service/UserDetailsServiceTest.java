package com.hourtracker.HourTracker.service;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserDetailsServiceTest {

    @Test
    public void generate_encrypted_password(){

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "Kb102392";
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println(encodedPassword);
        assertThat(rawPassword, not(encodedPassword));
    }

}