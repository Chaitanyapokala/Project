package com.capgemini.fms.user;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.dto.Booking;
import com.capgemini.fms.dto.Flight;
import com.capgemini.fms.dto.User;
import com.capgemini.fms.exception.BookingException;
import com.capgemini.fms.service.BookingService;
import com.capgemini.fms.service.BookingServiceImp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Booking> bookinglist = new ArrayList<Booking>();
		BookingService serve = new BookingServiceImp();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome");
			System.out.println("1.Add Booking");
			System.out.println("2.Modify Booking");
			System.out.println("3.View Booking By Id");
			System.out.println("4.View Bookings");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Added");
				break;
			case 2:
				System.out.println("Modified");
				break;
			case 3:
				System.out.println("Enter bookingid to get details of that booking");
				int id=scan.nextInt();
				scan.nextLine();
				try
				{
					List<Booking> list=serve.viewBooking(id);
					for(Booking book: list)
					{
						User user=book.getUserid();
						LocalDate date=book.getBookingDate();
						double cost=book.getTicketCost();
						Flight flight=book.getFlight();
						int num1=book.getNoOfPassenger();
						System.out.println("Bookingid:"+id+" userId:"+user+" Date:"+date+" Cost: "+cost+" Flight:"+flight+" Number of Passengers:"+num1);
					}
				}
				catch(BookingException e)
				{
					System.err.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Details of all bookings");
				try
				{
					List<Booking> list=serve.viewBooking();
					for(Booking book: list)
					{
						long number=book.getBookingid();
						User user=book.getUserid();
						LocalDate date=book.getBookingDate();
						double cost=book.getTicketCost();
						Flight flight=book.getFlight();
						int num1=book.getNoOfPassenger();
						System.out.println("Bookingid:"+number+" userId:"+user+" Date:"+date+" Cost:"+cost+" Flight:"+flight+" Number of Passengers:"+num1);
					}
				}
				catch(BookingException e)
				{
					System.err.println(e.getMessage());
				}
			default:
				break;
			}
		}
	}
}
