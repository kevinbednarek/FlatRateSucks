package com.hourtracker.HourTracker.web;

import com.hourtracker.HourTracker.domain.User;
import com.hourtracker.HourTracker.domain.Work;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class DashboardAddController {

    @GetMapping("/dashboardAdd")
    public String getDashboardAdd(ModelMap model) {
        return "dashboardAdd";
    }

    @PostMapping("/dashboardAdd")
    public String createWork(@AuthenticationPrincipal User user){
        Work job = new Work();

        job.setPaid(Boolean.FALSE);
        job.setUser(user);

        return "redirect:/dashboardAdd";
    }
}
