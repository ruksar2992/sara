package com.mvc.spring.service;



import java.util.List;

import com.mvc.spring.model.Bus;

public interface BusService {
	
	//@return bus by busid
	public Bus busDetail(int busid);
	//@return list of bus
	public List<Bus> getBus(String i, String j, String k);
	
}
