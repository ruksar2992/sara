package com.mvc.spring.Dao.Impl;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.spring.Dao.BusDao;
import com.mvc.spring.model.Bus;

@Repository
public class BusDaoImpl implements BusDao {
	//{@inheritDoc}
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	@Override
	public List<Bus> getbus(String i, String j, String k) {
		
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery("select * from Bus where source=? and destination=? and depatureDate=?");
		query.addEntity(Bus.class);
		query.setParameter(0, i);
		query.setParameter(1, j);
		query.setParameter(2, k);
		List result = query.list();
		if (result.size() > 0) {
			return result;
		}
		return null;

	}

	@Transactional
	@Override
	public Bus busDetail(int busid) {
		Session session = sessionFactory.getCurrentSession();

		Bus busDetails = (Bus) session.get(Bus.class, busid);
		System.out.println(busDetails);
		return busDetails;

	}
}
