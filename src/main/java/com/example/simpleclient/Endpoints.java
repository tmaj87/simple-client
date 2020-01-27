package com.example.simpleclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class Endpoints {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Vegas!";
    }

    @GetMapping("/")
    public void defaultEndpoint(HttpServletResponse response) throws IOException {
        response.sendRedirect("/actuator");
    }
}
