
package com.qunniox.airlines.services;

import org.springframework.http.ResponseEntity;
import java.math.BigInteger;

import com.qunniox.airlines.entities.Flight;

public interface FlightService {
	public ResponseEntity<?> addFlight(Flight flight);

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlight(Integer flightNumber);

	public Flight modifyFlight(Flight flight);

	public String removeFlight(Integer flightNumber);


}
