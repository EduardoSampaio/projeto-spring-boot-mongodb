package com.spring.boot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
