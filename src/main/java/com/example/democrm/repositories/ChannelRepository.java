package com.example.democrm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrm.domain.Channel;

public interface ChannelRepository extends MongoRepository<Channel, String>{

}
