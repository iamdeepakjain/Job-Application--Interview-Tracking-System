package com.jobportal.controller;

import com.jobportal.entity.user;
import com.jobportal.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public user createuser(@RequestBody user user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }
}
