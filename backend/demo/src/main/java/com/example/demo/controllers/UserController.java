package com.example.demo.controllers;

import com.example.demo.entities.UserEntity;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
        UserEntity userCreated = userService.insertUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
