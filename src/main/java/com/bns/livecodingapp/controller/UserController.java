package com.bns.livecodingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bns.livecodingapp.model.User;
import com.bns.livecodingapp.service.UserMongoService;

@RestController("/usermongo")
public class UserController {

	@Autowired
	UserMongoService userMongoService;

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User saveUser(@RequestBody User obj) {
		return userMongoService.saveUser(obj);

	}

}
