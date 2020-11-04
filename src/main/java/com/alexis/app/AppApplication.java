package com.alexis.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {

        // Here is our app. It has an EMBEDDED TOMCAT SERVER
        // Runs on port 8080
        SpringApplication.run(AppApplication.class, args);
    }

}
