package com.example.democrm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrm.domain.Organization;

public interface OrganizationRepository extends MongoRepository<Organization, String>{

}
