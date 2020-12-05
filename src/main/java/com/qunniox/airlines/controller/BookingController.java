package com.qunniox.airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.qunniox.airlines.entities.Booking;
import com.qunniox.airlines.exceptions.RecordNotFoundException;
import com.qunniox.airlines.services.BookingService;
import com.qunniox.airlines.services.FlightService;

@RestController
@RequestMapping
@CrossOrigin(origins="*",allowedHeaders="*")
@Transactional
public class BookingController {

	@Autowired
	BookingService bookingService;
	@Autowired
	FlightService flightService;

	@PostMapping("/createBooking")
	
	public void addBooking(@RequestBody Booking newBooking) {

		bookingService.createBooking(newBooking);
		/*try {
			newBooking.setFlight(flightService.viewFlight(newBooking.getBookingId()));
		} catch (RecordNotFoundException e1) 
		{
			return new ResponseEntity("Flight Not Found", HttpStatus.BAD_REQUEST);
		}
		return null;*/
	}

	@GetMapping("/readAllBooking")
	public Iterable<Booking> readAllBookings() {

		return bookingService.displayAllBooking();
	}

	@PutMapping("/updateBooking/{id}")
	
	public void modifyBooking(@PathVariable ("id") Integer bookingId,@RequestBody Booking updateBooking) {
		updateBooking.setBookingId(bookingId);
		bookingService.updateBooking(updateBooking);
	}

	@GetMapping("/searchBooking/{id}")

	public ResponseEntity<?> searchBookingByID(@PathVariable("id")Integer bookingId) {

		return bookingService.findBookingById(bookingId);
	}

	@DeleteMapping("/deleteBooking/{id}")
	public void deleteBookingByID(@PathVariable("id") Integer bookingId) {

		bookingService.deleteBooking(bookingId);
	}
	
	
	
	
}
