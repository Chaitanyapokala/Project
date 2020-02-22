package com.capgemini.fms.dao;

import java.util.List;

import com.capgemini.fms.dto.Booking;

public interface BookingDao {
	
	Booking addBooking(Booking bookingid);
	Booking modifyBooking(Booking bookingid);
	List<Booking> viewBooking(long bookingid);
	List<Booking> viewBooking();
	void deleteBooking(long d);
}
