package com.garugi.pamdus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {

    @GetMapping("/")
    public String index() {
        return "landing"; // points to src/main/resources/templates/landing.html
    }
}
