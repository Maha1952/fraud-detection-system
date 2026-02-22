package com.maha.fraudsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    @GetMapping("/")
    public String hello() {
        return "Fraud System is Running 🚀";
    }
}

