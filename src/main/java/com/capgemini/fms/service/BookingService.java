package com.capgemini.fms.service;

import java.util.List;

import com.capgemini.fms.dto.Booking;
import com.capgemini.fms.dto.Passenger;

public interface BookingService {

	Booking addBooking(Booking bookingid);
	Booking modifyBooking(Booking bookingid);
	List<Booking> viewBooking(long bookingid);
	List<Booking> viewBooking();
	void deleteBooking(long bookingid);
	void validateBooking(Booking bookingid);
	void validadatePassenger(Passenger p);
}
