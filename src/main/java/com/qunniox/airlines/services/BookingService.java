package com.qunniox.airlines.services;

import org.springframework.http.ResponseEntity;
import java.math.BigInteger;

import com.qunniox.airlines.entities.Booking;

public interface BookingService {

	public ResponseEntity<?> createBooking(Booking newBooking);

	public Booking updateBooking(Booking newBooking);

	public String deleteBooking(Integer bookingId);

	public Iterable<Booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(Integer bookingId);

	String confirmBooking(Integer bookingId);
}
