package com.qunniox.airlines.entities;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import java.math.BigInteger;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="booking")
public class Booking {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@NotNull
	private Integer bookingId;
	//@OneToOne(fetch = FetchType.EAGER)
	//@NotNull
	//private Flight flight;
	private String bookingDate;
	private String passengerName;
	private int passengerAge;
	private Long passengerUIN;
	private Double luggage;
	
	public Booking() {

	}

	/*
	 * Parameterized constructor
	 */
	public Booking(Integer bookingId, com.qunniox.airlines.entities.Flight flight, String bookingDate,String passengerName, int passengerAge,  Long passengerUIN, Double luggage) {
		super();
		this.bookingId = bookingId;
		//this.flight = flight;
		this.bookingDate = bookingDate;
		this.passengerName= passengerName;
		this.passengerAge= passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
	}


	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
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

	public Long getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(Long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	public Double getLuggage() {
		return luggage;
	}

	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}
	
}
