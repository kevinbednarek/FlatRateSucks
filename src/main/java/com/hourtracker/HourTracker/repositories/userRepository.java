package com.hourtracker.HourTracker.repositories;

import com.hourtracker.HourTracker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Integer> {
}
