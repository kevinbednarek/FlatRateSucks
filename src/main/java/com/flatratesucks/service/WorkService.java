package com.flatratesucks.service;

import com.flatratesucks.repositories.WorkRepository;
import com.flatratesucks.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WorkRepository workRepository;


}
