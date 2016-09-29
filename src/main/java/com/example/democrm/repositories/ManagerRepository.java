package com.example.democrm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrm.domain.Manager;

public interface ManagerRepository extends MongoRepository<Manager, String>{

}
