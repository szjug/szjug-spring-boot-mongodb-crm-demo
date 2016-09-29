package com.example.democrm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrm.domain.ClientContact;

public interface ClientContactRepository extends MongoRepository<ClientContact, String>{

}
