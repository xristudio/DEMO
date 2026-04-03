package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class holacontroller {

    @GetMapping("/saludo")
    public String hola(@RequestParam String nombre, Model model) {

        model.addAttribute("nombre", nombre);

        return "saludo";
    }

}
