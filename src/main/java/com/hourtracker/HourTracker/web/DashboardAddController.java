package com.hourtracker.HourTracker.web;

import com.hourtracker.HourTracker.domain.User;
import com.hourtracker.HourTracker.domain.Work;
import com.hourtracker.HourTracker.repositories.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DashboardAddController {

    @Autowired
    private WorkRepository workRepository;

    @GetMapping("/dashboardAdd")
    public String getDashboardAdd(ModelMap model) {
        return "dashboardAdd";
    }

    @PostMapping("/dashboardAdd")
    public String createJob(@AuthenticationPrincipal User user){
        Work job = new Work();

        job.setUser(user);

        job = workRepository.save(job); //doesn't seem to work with this



        return "redirect:/dashboardAdd";
    }
}
