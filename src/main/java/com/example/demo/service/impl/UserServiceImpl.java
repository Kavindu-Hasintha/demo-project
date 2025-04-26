package com.example.demo.service.impl;

import com.example.demo.entities.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User addUser(User user) {
        User savedUser = userRepo.save(user);
        return savedUser;
    }

    @Override
    public User getUserByEmail(String email) {
        User user = userRepo.findByEmail(email).get();
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepo.findAll();
        return users;
    }
}
