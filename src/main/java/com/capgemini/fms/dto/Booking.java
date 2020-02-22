package com.capgemini.fms.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

	private long bookingid;
	private User userid;
	private LocalDate bookingDate;
	private double ticketCost;
	List<Passenger> passengerList = new ArrayList<Passenger>();
	private Flight flight;
	int noOfPassenger;
	public Booking(long bookingid,User userid,LocalDate bookingDate,double ticketCost,Flight flight,int noOfPassenger)
	{
		super();
		this.bookingid=bookingid;
		this.userid=userid;
		this.bookingDate=bookingDate;
		this.ticketCost=ticketCost;
		//this.passengerList=passengerList;
		this.flight=flight;
		this.noOfPassenger=noOfPassenger;
	}
	public long getBookingid() {
		return bookingid;
	}
	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
		this.userid = userid;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public List<Passenger> getList() {
		return passengerList;
	}
	public void setList(List<Passenger> list) {
		this.passengerList = list;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", userid=" + userid + ", bookingDate=" + bookingDate
				+ ", ticketCost=" + ticketCost + ", passengerList=" + passengerList + ", flight=" + flight
				+ ", noOfPassenger=" + noOfPassenger + "]";
	}
}
