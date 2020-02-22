package com.capgemini.fms.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.fms.dao.BookingDao;
import com.capgemini.fms.dao.BookingDaoImp;
import com.capgemini.fms.dto.Booking;
import com.capgemini.fms.dto.Flight;
import com.capgemini.fms.dto.User;

public class FmsTest {

	BookingDao dao;
	
	Flight flight1 = new Flight(785, "Single-Class", "E4", 55);
	Flight flight2 = new Flight(324, "Economy", "F4", 40);

	User user1 = new User("Male", 15642, "Raju", "xxxxx", 894545455, "ABCD@gmail.com");
	User user2 = new User("Female", 15641, "Ravi", "xxxx", 954545644, "ACD@email.com");
	
	Booking book1 = new Booking(4561, user1, LocalDate.now(), 9845.36, flight1, 36);
	Booking book3 = new Booking(4562, user2, LocalDate.now(), 2564.36, flight2, 48);
	

@BeforeEach
public void setUp()
{
	dao=new BookingDaoImp();
}

@Test
public void viewBooking() 
{
	
	assertEquals(book3,book3);
}
}