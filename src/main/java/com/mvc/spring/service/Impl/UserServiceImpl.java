package com.mvc.spring.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.spring.Dao.UserDao;
import com.mvc.spring.model.User;
import com.mvc.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
//@inheritDoc
	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);

	}
//@inheritDoc
	@Override
	public boolean authenticateUser(String username, String password) {
		return userDao.authenticateUser(username, password);
	}

}
