package com.example.democrm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrm.domain.Client;

public interface ClientRepository extends MongoRepository<Client, String>{

}
