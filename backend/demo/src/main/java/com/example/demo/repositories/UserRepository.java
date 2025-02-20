package com.example.demo.repositories;

import com.example.demo.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <UserEntity,String> {
    UserEntity findByUsername(String username);

}
