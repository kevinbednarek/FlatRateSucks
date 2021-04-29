package com.hourtracker.HourTracker.service;

import com.hourtracker.HourTracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkService {

    @Autowired
    private UserRepository userRepository;
}
