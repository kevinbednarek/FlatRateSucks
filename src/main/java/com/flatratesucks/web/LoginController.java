package com.flatratesucks.web;

import com.flatratesucks.domain.User;
import com.flatratesucks.service.UserService;
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
        return "redirect:/about";
    }

    @PostMapping("/logout")
    public String logoutPost(){

        System.out.println("Logged out");

        return "redirect:/index";

    }

    @GetMapping("/about")
    public String about(){

        System.out.println("about get mapping");

        return "about";
    }
}
