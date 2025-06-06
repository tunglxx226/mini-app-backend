package com.example.miniappbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;

@RestController
public class GreetingController {

    @GetMapping("/api/greeting")
    public Map<String, String> getGreeting() {
        // We return a Map which Spring Boot automatically converts to JSON.
        // This matches the structure the Flutter app expects.
        return Collections.singletonMap("message", "Hello from Spring Boot!");
    }
}