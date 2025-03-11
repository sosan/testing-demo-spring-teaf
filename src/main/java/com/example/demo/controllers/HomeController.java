package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensaje", "¡Hola desde Thymeleaf!");
        return "index"; // Nombre de la plantilla (index.html)
    }
}