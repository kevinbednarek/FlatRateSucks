package com.hourtracker.HourTracker.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    //using getmapping instead
    //@GetMapping("/")
    public String rootView () {
        return "index";
    }
}