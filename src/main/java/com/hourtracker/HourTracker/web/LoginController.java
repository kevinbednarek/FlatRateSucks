package com.hourtracker.HourTracker.web;

import com.hourtracker.HourTracker.domain.User;
import com.hourtracker.HourTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){

        System.out.println("login get mapping");

        return "login";
    }

    @GetMapping("/register")
    public String register(ModelMap model) {

        System.out.println("register get mapping. Puts the user on the model?");

        model.put("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerPost(User user) {

        System.out.println("register post mapping. Saves the user with user service?");

       User savedUser = userService.save(user);
        return "redirect:/login";
    }
}
