package com.example.demo.services;

import com.example.demo.entities.UserEntity;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;

import java.util.Optional;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<UserEntity> getUserById(String id){
        return userRepository.findById(id);
    }

    public boolean deleteUser(String id){
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
            return false;
    }

    public UserEntity insertUser (UserEntity user){
        return userRepository.insert(user);
    }

}
