package com.bns.livecodingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bns.livecodingapp.model.User;
import com.bns.livecodingapp.repository.UserMongoRepository;

@Service
public class UserMongoService {
	@Autowired
	UserMongoRepository userMongoRepository;//NOSQL


	public User saveUser(User obj) {
		return userMongoRepository.save(obj);
	}



}
