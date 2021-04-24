package com.hourtracker.HourTracker.repositories;

import com.hourtracker.HourTracker.domain.User;
import com.hourtracker.HourTracker.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface WorkRepository extends JpaRepository<Work, Integer> {

    @Query("select w from Work w"
            + " join fetch w.user"
            + " where w.id = :id")
    Optional<Work> findByIdWithUser(Integer id);

    //select * from work where user = :user
    List<Work> findByUser(User user);

    //select * from work where repairOder = :repairOrder
    List<Work> findByRepairOrder(Integer repairOrder);

    //select * from work where description = :description
    List<Work> findByDescription(String description);

    //select * from work where hours = :hours
    List<Work> findByHours(Integer hours);

    //select * from work where date = :date
    List<Work> findByDate(LocalDate date);

    //select * from work where paid = :paid
    List<Work> findByPaid(Boolean paid);

}
