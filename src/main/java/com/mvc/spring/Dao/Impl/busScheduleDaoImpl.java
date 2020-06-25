package com.mvc.spring.Dao.Impl;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.spring.Dao.BusScheduleDao;

import com.mvc.spring.model.BusSchedule;


@Repository
public class busScheduleDaoImpl implements BusScheduleDao{
	//@inheritDoc
	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	@Override
	public List<BusSchedule> busScheduleDetail(String busno) {
		List<BusSchedule> busScheduleList=new ArrayList< BusSchedule>();
		  Session session = sessionFactory.getCurrentSession();
		  System.out.println("from bus"); String hql ="from BusSchedule where busno= :busno";
		  Query<BusSchedule> query = session.createQuery(hql); 
		  query.setParameter("busno", busno);
		  busScheduleList=query.list(); 
		  return busScheduleList;
	}

}
