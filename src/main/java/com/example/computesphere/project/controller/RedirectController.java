package com.example.computesphere.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

    @GetMapping("/")
    public RedirectView redirectToHome() {
        return new RedirectView("/home");
    }
}
