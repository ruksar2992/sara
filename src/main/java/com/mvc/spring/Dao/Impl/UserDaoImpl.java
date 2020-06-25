package com.mvc.spring.Dao.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.spring.Dao.UserDao;
import com.mvc.spring.model.User;


@Repository
public class UserDaoImpl implements UserDao {
	//{@inheritDoc}
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	@Override
	public void saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);
	}

	@Transactional
	@Override
	public boolean authenticateUser(String username, String password) {

		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("rawtypes")
		SQLQuery query = session.createSQLQuery("select * from User where name=? and password=?");
		query.addEntity(User.class);
		query.setParameter(0, username);
		query.setParameter(1, password);
		@SuppressWarnings("rawtypes")
		List result = query.list();
		if (result.size() > 0)
			return true;
		return false;
	}
}
