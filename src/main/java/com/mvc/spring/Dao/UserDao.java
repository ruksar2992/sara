package com.mvc.spring.Dao;

import com.mvc.spring.model.User;

public interface UserDao {
	public void saveUser(User user);
//return User with the requested username and password
	public boolean authenticateUser(String username, String password);
}
