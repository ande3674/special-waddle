package com.alexis.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class AppRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!!! Local time on server is: " + LocalDateTime.now();
    }

    @GetMapping("/ali")
    public String ali() { return "Ali Rules!"; }

    @GetMapping("/alexis")
    public String alexis() { return "Alexis Rules!"; }

}
