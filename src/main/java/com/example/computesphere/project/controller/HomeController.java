package com.example.computesphere.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class HomeController {

    public RedirectView redirectToHome() {
        return new RedirectView("/home");
    }
    
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
