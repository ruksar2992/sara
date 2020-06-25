package com.mvc.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusSchedule {
	//Creates BusSchedule with scheduleid,busno,depatureDateTime,Duration
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleid;

	@Override
	public String toString() {
		return "BusSchedule [scheduleid=" + scheduleid + ", busno=" + busno + ", depatureDateTime=" + depatureDateTime
				+ ", Duration=" + Duration + "]";
	}

	private String busno;
	private String depatureDateTime;
	private String Duration;

	public int getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(int scheduleid) {
		this.scheduleid = scheduleid;
	}

	public String getBusno() {
		return busno;
	}

	public void setBusno(String busno) {
		this.busno = busno;
	}

	public String getDepatureDateTime() {
		return depatureDateTime;
	}

	public void setDepatureDateTime(String depatureDateTime) {
		this.depatureDateTime = depatureDateTime;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}
	private String source;
	private String destination;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	


}
