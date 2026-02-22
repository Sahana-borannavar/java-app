package com.demo.java_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Existing endpoint — case-sensitive
    @GetMapping("/")
    public String hello() {
        return "Hello, Everyone....!";
    }

   
   }

