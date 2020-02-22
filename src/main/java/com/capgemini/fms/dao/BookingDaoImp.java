package com.capgemini.fms.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.fms.dto.Booking;
import com.capgemini.fms.dto.Flight;
import com.capgemini.fms.dto.User;
import com.capgemini.fms.exception.BookingException;

public class BookingDaoImp implements BookingDao {

	List<Booking> bookinglist = new ArrayList<Booking>();

	public BookingDaoImp() {
		Flight flight1 = new Flight(785, "Single-Class", "E4", 55);//From Flight Class i.e;dto layer
		Flight flight2 = new Flight(324, "Economy", "F4", 40);
		Flight flight3 = new Flight(905, "Business", "W1", 45);

		User user1 = new User("Male", 15642, "Raju", "xxxxx", 894545455, "ABCD@gmail.com");//From User Class i.e;dto layer
		User user2 = new User("Female", 15641, "Ravi", "xxxx", 954545644, "ACD@email.com");
		User user3 = new User("Male", 156852, "Shiva", "xxxxx",794465464, "AB@yahoomail.com");

		/*
		 * List<Passenger> list = new ArrayList<Passenger>(); Passenger p1 = new
		 * Passenger(89457621, "Raju k", 46, 562489, 53.64); Passenger p2 = new
		 * Passenger(56565895, "S Ravi", 35, 544545, 25.37); Passenger p3 = new
		 * Passenger(65689868, "B Shiva", 20, 454145, 45.3); list.add(p1); list.add(p2);
		 * list.add(p3);
		 */

		Booking book1 = new Booking(4561, user1, LocalDate.now(), 9845.36, flight1, 36);//From Booking Class i.e;dto layer
		Booking book2 = new Booking(4563, user3, LocalDate.now(), 4563.36, flight3, 25);
		Booking book3 = new Booking(4562, user2, LocalDate.now(), 2564.36, flight2, 48);
		bookinglist.add(book1);
		bookinglist.add(book2);
		bookinglist.add(book3);

	}

	public Booking addBooking(Booking bookingid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Booking modifyBooking(Booking bookingid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> viewBooking(long bookingid) {
		// TODO Auto-generated method stub
		if (bookingid != 0) {
			List<Booking> list = bookinglist.stream().filter(p -> p.getBookingid() == bookingid ? true : false)
					.collect(Collectors.toList());
			return list;
		} else {
			throw new BookingException("Bookingid can't be zero");
		}
	}

	public List<Booking> viewBooking() {
		// TODO Auto-generated method stub3
		List<Booking> list = bookinglist.stream().collect(Collectors.toList());
		if (list != null) {
			return list;
		} else {
			throw new BookingException("Booking list is empty");
		}
	}

	public void deleteBooking(long bookingid) {
		// TODO Auto-generated method stub

	}

}
