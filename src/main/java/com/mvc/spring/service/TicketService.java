package com.mvc.spring.service;

import java.util.List;

import com.mvc.spring.model.Ticket;


public interface TicketService {
	
	//@param BusScheduleId, busId
		 //@return Ticket
	public List<Ticket> saveTicketDetails(int BusScheduleId, int busId);
}