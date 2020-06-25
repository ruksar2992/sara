package com.mvc.spring.Dao;

import java.util.List;

import com.mvc.spring.model.Ticket;

public interface TicketDao {
	
	//return list of Bus which matches the requested Id's
	List<Ticket> saveTicketDetails(int scheduleId, int busid);
	}