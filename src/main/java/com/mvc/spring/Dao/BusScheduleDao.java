package com.mvc.spring.Dao;

import java.util.List;

import com.mvc.spring.model.BusSchedule;

public interface BusScheduleDao {
	//return list of bus with requested busschedule
	public List<BusSchedule> busScheduleDetail(String busno);

}
