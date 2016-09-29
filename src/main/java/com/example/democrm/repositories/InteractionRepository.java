package com.example.democrm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrm.domain.Interaction;

public interface InteractionRepository extends MongoRepository<Interaction, String>{

}
