package com.mvc.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
	//Creates Ticket with Ticketid,BusId,BusScheduleId,UserId,NoOfTickets
	@Id
	private int Ticketid;
	private int BusId;
	private int BusScheduleId;
	private int UserId;
	private int NoOfTickets;
	
	public int getTicketid() {
		return Ticketid;
	}
	public void setTicketid(int ticketid) {
		Ticketid = ticketid;
	}
	public int getBusId() {
		return BusId;
	}
	public void setBusId(int busId) {
		BusId = busId;
	}
	public int getBusScheduleId() {
		return BusScheduleId;
	}
	public void setBusScheduleId(int busScheduleId) {
		BusScheduleId = busScheduleId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public int getNoOfTickets() {
		return NoOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		NoOfTickets = noOfTickets;
	}

}