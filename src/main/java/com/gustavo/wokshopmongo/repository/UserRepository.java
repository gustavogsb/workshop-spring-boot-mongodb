package com.gustavo.wokshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.wokshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
