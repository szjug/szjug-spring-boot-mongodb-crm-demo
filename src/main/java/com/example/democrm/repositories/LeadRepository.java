package com.example.democrm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrm.domain.Lead;

public interface LeadRepository extends MongoRepository<Lead, String>{

}
