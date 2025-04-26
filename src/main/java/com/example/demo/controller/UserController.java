package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUser() {
        String result = "User is demo, and welcome!";

        return ResponseEntity.ok(result);
    }

    @GetMapping("/me")
    public ResponseEntity<String> getMe() {
        String result = "Name: Kavindu, Age: 22, Address: Colombo-07";
        return ResponseEntity.ok(result);
    }
}
