package com.example.demo.controller;

import com.example.demo.service.DriverService;
import com.example.demo.dto.DriversList;
import com.example.demo.dto.MeetingDTO;
import com.example.demo.service.DriverService;
import com.example.demo.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class control {

    @Autowired
    private MeetingService meetingService;
    @Autowired
    private DriverService driverService;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World 2";
    }

    @GetMapping("/meetings/{p}")
    @ResponseBody

    public List<MeetingDTO> meetings(@PathVariable Integer p) {
        return meetingService.getMeetingsOf2026(p);
    }

    @GetMapping("/meetings")
    @ResponseBody
    public List<MeetingDTO> meetings() {
        return meetingService.getMeetingsOf2026(0);
    }

    // HTML
    @GetMapping("/paises/{p}")
    public String showPaises(@PathVariable Integer p, Model model) {
        List<MeetingDTO> meetings = meetingService.getMeetingsOf2026(p);
        model.addAttribute("meetings", meetings);
        return "paises";
    }

    // HTML
    @GetMapping("/drivers/{p}")
    public String showDrivers(@PathVariable Integer p, Model model) {
        List<DriversList> drivers = driverService.getDriversOf2026(p, 0);
        model.addAttribute("drivers", drivers);
        return "drivers";
    }

    @GetMapping("/drivers/{p}/sesion/{s}")
    @ResponseBody

    public List<DriversList> drivers(@PathVariable("p") Integer p, @PathVariable("s") Integer s) {
        return driverService.getDriversOf2026(p, s);
    }

    // https://api.openf1.org/v1/sessions?country_name=Japan&year=2026

}
