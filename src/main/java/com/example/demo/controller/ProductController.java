package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v2/product")
public class ProductController {

    @GetMapping
    public ResponseEntity<String> getProduct() {
        String result = "Product 1: testing...";
        return ResponseEntity.ok(result);
    }
}
