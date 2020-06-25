package com.mvc.spring.service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mvc.spring.Dao.BusDao;
import com.mvc.spring.model.Bus;
import com.mvc.spring.service.BusService;

@Service
public class BusServiceImpl implements BusService {
	@Autowired
	BusDao busDao;
//{@inheritDoc}
	@Override
	public List<Bus> getBus(String i, String j, String k) {
		return busDao.getbus(i, j, k);
	}
//{@inheritDoc}
	@Override
	public Bus busDetail(int busid) {

		return busDao.busDetail(busid);
	}

	

}
