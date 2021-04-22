package com.hourtracker.HourTracker.repositories;

import com.hourtracker.HourTracker.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Integer> {

}
