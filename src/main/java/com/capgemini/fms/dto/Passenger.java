package com.capgemini.fms.dto;


public class Passenger {
	
	private long pnrNumber;
	private String passengerName;
	private int passengerAge;
	private long passengerUIN;
	private double Luggage;
	public Passenger(long pnrNumber,String passengerName,int passengerAge,long passengerUIN,double Luggage)
	{
		super();
		this.pnrNumber=pnrNumber;
		this.passengerName=passengerName;
		this.passengerAge=passengerAge;
		this.passengerUIN=passengerUIN;
		this.Luggage=Luggage;
	}
	public long getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public long getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public double getLuggage() {
		return Luggage;
	}
	public void setLuggage(double luggage) {
		Luggage = luggage;
	}
	@Override
	public String toString() {
		return "Passenger [pnrNumber=" + pnrNumber + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerUIN=" + passengerUIN + ", Luggage=" + Luggage + "]";
	}
	
}
