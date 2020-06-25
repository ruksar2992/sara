package com.mvc.spring.service;

import java.util.List;

import com.mvc.spring.model.BusSchedule;

public interface BusScheduleService {
	//@param busno
	 //@return BusSchedule
	public List<BusSchedule> busScheduleDetail(String busno);

}
