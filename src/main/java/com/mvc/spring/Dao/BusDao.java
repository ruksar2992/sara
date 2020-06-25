package com.mvc.spring.Dao;



import java.util.List;

import com.mvc.spring.model.Bus;

public interface BusDao {

	
//return Bus which matches the requested route
	public Bus busDetail(int busid);

	
//return list of Bus which matches the requested route
	public List<Bus> getbus(String i, String j, String k);
}
