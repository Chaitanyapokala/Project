package com.capgemini.fms.exception;

public class BookingException extends RuntimeException {

	public BookingException(String s) {
		super(s);
	}

	public BookingException() {
		super();
	}
}
