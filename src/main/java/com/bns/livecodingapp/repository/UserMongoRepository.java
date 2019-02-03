package com.bns.livecodingapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bns.livecodingapp.model.User;
@Repository
public interface UserMongoRepository extends MongoRepository<User, Integer> {

}
