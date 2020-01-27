package com.example.simpleclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoints {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Vegas!";
    }
}
