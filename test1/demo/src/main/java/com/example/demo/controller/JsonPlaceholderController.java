package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.JsonPlaceholderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JsonPlaceholderController {

    private final JsonPlaceholderService jsonPlaceholderService;

    @Autowired
    public JsonPlaceholderController(JsonPlaceholderService jsonPlaceholderService) {
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

    @GetMapping("/users")
    public User[] getAllUsers() {
        return jsonPlaceholderService.getAllUsers();
    }
}
