package com.example.simpleclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.POST;

@Component
public class HTTPCaller {

    private final RestTemplate template = new RestTemplate();
    private final HttpHeaders headers = new HttpHeaders();

    public String postBody(String uri, String body) {
        HttpEntity<?> request = new HttpEntity<Object>(body, headers);
        ResponseEntity<String> response = template.exchange(uri, POST, request, String.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        return "failed";
    }
}