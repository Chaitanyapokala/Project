package com.capgemini.fms.service;

import java.util.List;

import com.capgemini.fms.dao.BookingDao;
import com.capgemini.fms.dao.BookingDaoImp;
import com.capgemini.fms.dto.Booking;
import com.capgemini.fms.dto.Passenger;
import com.capgemini.fms.exception.BookingException;

public class BookingServiceImp implements BookingService {


	BookingDao dao = new BookingDaoImp();

	public Booking addBooking(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	public Booking modifyBooking(Booking bookingid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> viewBooking(long bookingid){
		// TODO Auto-generated method stub
		boolean flag=false;
		String num=String.valueOf(bookingid);
		flag=num.matches("[1-9][0-9]{3}");
		if(flag==false)
		{
			throw new BookingException("Invalid booking id");
		}
		
		return dao.viewBooking(bookingid);
	}

	public List<Booking> viewBooking() {
		// TODO Auto-generated method stub
		return dao.viewBooking();
	}

	public void deleteBooking(long bookingid) {
		// TODO Auto-generated method stub
		
	}

	public void validateBooking(Booking bookingid) {
		// TODO Auto-generated method stub
		
	}

	public void validadatePassenger(Passenger p) {
		// TODO Auto-generated method stub
		
	}
	
	
}
