package com.demo.java_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Existing endpoint — case-sensitive
    @GetMapping("/api/Hello")
    public String hello() {
        return "Hello from Sahana!";
    }

    // Optional: avoid Whitelabel 404 on "/"
    @GetMapping("/")
    public String root() {
        return "App is up. Try /api/Hello";
   }
}
