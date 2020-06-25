package com.mvc.spring.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.spring.Dao.BusScheduleDao;
import com.mvc.spring.model.BusSchedule;
import com.mvc.spring.service.BusScheduleService;

@Service
public class BusScheduleServiceImpl implements BusScheduleService {
	
	@Autowired
	BusScheduleDao busScheduleDao;
//{@inheritDoc}
	@Override
	public List<BusSchedule> busScheduleDetail(String busno) {
		return busScheduleDao.busScheduleDetail(busno);
	}

}