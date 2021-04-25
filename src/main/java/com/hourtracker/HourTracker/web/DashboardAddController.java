package com.hourtracker.HourTracker.web;

import com.hourtracker.HourTracker.domain.User;
import com.hourtracker.HourTracker.domain.Work;
import com.hourtracker.HourTracker.repositories.WorkRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
public class DashboardAddController {

    @Autowired
    private WorkRepository workRepository;

    @GetMapping("/reviewWork") //changed from dashboardAdd to workView
    public String getJobs(@AuthenticationPrincipal User user, ModelMap model) {

        System.out.println("get mapping for dashboardAdd, should return workView");

        model.put("jobs", new Work()); //added this, let's see
        List<Work> work = workRepository.findByUser(user); //this is new and may be unnecessary.
        model.put("jobs", work);
        return "jobs";
    }

    /*@PostMapping("/dashboardAdd/{workId}")
    public String saveProduct(@PathVariable Integer workId, Work work) {

        job = workRepository.save(job);

        return "redirect:/products/"+work.getId(); //have work instead of job?
    }*/ //may try this later

    @GetMapping("/dashboardAdd/{workId}")
    public String getWork(@PathVariable Integer workId, ModelMap model, HttpServletResponse response) throws IOException {
       Optional<Work> jobOpt = workRepository.findByIdWithUser(workId);

       System.out.println("dashboardAdd with id get mapping");

       if (jobOpt.isPresent()){
           Work job = jobOpt.get();
           model.put("job", job);

       } else{
           Work job = new Work();
           model.put("job", job);
           response.sendError(HttpStatus.NOT_FOUND.value(), "Job with id " + workId +" was not found.");
           return "dashboardAdd/{workId}";
       }


        return "dashboardAdd";
    }

    @PostMapping("/dashboardAdd/{workId}")
    public String saveWork(@PathVariable Integer workId, Work job){

        System.out.println("dashboardAdd with id post mapping. Should save.");
        //job.setDate(LocalDate.now());
        System.out.println(job);
        job = workRepository.save(job);
        return "redirect:/dashboard";
    }

    @PostMapping("/dashboardAdd")
    public String createJob(@AuthenticationPrincipal User user){

        System.out.println("dashboardAdd with NO id post mapping. Makes jobs?");

        Work job = new Work();

        job.setPaid(false);
        job.setDate(LocalDate.now());
        System.out.println("Paid is set to 0");
        job.setUser(user);

        job = workRepository.save(job);



        return "redirect:/dashboardAdd/"+ job.getId(); //may need to be plural?
    }
}
