package com.example.demo.service;

import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User getUserByEmail(String email);
    List<User> getAllUsers();
}
