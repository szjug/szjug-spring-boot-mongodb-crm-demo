package com.example.democrm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrm.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
