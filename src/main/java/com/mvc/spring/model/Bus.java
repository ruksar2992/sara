package com.mvc.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {
	//Creates a Bus with busid,busno,companyname,seats,bustype,source,destination and depatureDate 
	@Id
	private int busid;
	private String busno;
	private String companyname;
	private int seats;
	private String bustype;
	private String source;
	private String destination;
	private String depatureDate;
	
	@Override
	public String toString() {
		return "Bus [busid=" + busid + ", busno=" + busno + ", companyname=" + companyname + ", seats="
				+ seats + ", bustype=" + bustype + ", source=" + source + ", destination=" + destination + ", depatureDate="
				+ depatureDate + "]";
	}

	public String getDepatureDate() {
		return depatureDate;
	}

	public void setDepatureDate(String depatureDate) {
		this.depatureDate = depatureDate;
	}

	public int getBusid() {
		return busid;
	}

	public void setBusid(int busid) {
		this.busid = busid;
	}

	public String getBusno() {
		return busno;
	}

	public void setBusno(String busno) {
		this.busno = busno;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getBustype() {
		return bustype;
	}

	public void setBustype(String bustype) {
		this.bustype = bustype;
	}

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
