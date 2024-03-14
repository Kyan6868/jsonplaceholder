package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceholderService {
    
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://jsonplaceholder.typicode.com/users";

    @Autowired
    public JsonPlaceholderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User[] getAllUsers() {
        return restTemplate.getForObject(BASE_URL, User[].class);
    }
}
