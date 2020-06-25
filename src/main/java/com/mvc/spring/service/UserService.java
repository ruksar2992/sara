package com.mvc.spring.service;

import com.mvc.spring.model.User;

public interface UserService {
	//@param user
	//@return User
	public void saveUser(User user);
	//@param login
	//@return User 
	public boolean authenticateUser(String username, String password);
}
