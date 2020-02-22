package com.capgemini.fms.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.fms.dao.BookingDao;
import com.capgemini.fms.dao.BookingDaoImp;
import com.capgemini.fms.dto.Booking;
import com.capgemini.fms.dto.Flight;
import com.capgemini.fms.dto.Passenger;
import com.capgemini.fms.dto.User;

public class FmsTest {

	BookingDao dao;
	
	Flight flight1 = new Flight(785, "Single-Class", "E4", 55);
	Flight flight2 = new Flight(324, "Economy", "F4", 40);

	User user1 = new User("Male", 15642, "Raju", "xxxxx", 894545455, "ABCD@gmail.com");
	User user2 = new User("Female", 15641, "Ravi", "xxxx", 954545644, "ACD@email.com");
	
	List<Passenger> list = new ArrayList<Passenger>();
	Passenger p1 = new Passenger(89457621, "Raju k", 46, 562489, 53.64);
	//list.add(p1);
	Booking book1 = new Booking(4561, user1, LocalDate.now(), 9845.36, list, flight1, 36);
	List<Passenger> list1 = new ArrayList<Passenger>();
	Passenger p2 = new Passenger(56565895, "S Ravi", 35, 544545, 25.37);
	//list1.add(p2);
	Booking book2 = new Booking(4562, user2, LocalDate.now(), 2564.36, list1, flight2, 48);
	

@BeforeEach
public void setUp()
{
	dao=new BookingDaoImp();
}

@Test
public void testviewBooking() 
{

	assertEquals(book1,book2);
	
}
}