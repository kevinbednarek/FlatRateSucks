package com.flatratesucks.web;

import com.flatratesucks.repositories.WorkRepository;
import com.flatratesucks.domain.User;
import com.flatratesucks.domain.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class DashboardController {

    @Autowired
    private WorkRepository workRepository;

    @GetMapping("/index")
    public String rootView () {
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard(@AuthenticationPrincipal User user, Integer id, ModelMap model){ //added stuff, let's see what works

        List<Work> jobs = workRepository.findByUser(user);
        Optional<Work> jobs2 = workRepository.findByIdWithUser(id);

        model.put("jobs", jobs);
        model.put("jobs2", jobs2);

        System.out.println(jobs);
        System.out.println(jobs2);

        System.out.println("dashboard get mapping. Puts user and stuff on the model.");

        return "dashboard";
    }

}
