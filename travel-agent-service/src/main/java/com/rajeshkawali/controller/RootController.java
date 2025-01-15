package com.rajeshkawali.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping("/actuator/info")
    public String home() {
        return "Welcome to the Travel Agent Service Application!";
    }
}
