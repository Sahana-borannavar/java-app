package com.demo.java_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Existing endpoint — case-sensitive
    @GetMapping("/a")
    public String hello() {
        return "Hello, Everyone....!";
    }

    // Optional: avoid Whitelabel 404 on "/"
    @GetMapping("/")
    public String root() {
        return "App is up. Try /api/Hello";
   }
}
