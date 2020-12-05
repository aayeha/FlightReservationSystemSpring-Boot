package com.qunniox.airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import org.springframework.web.bind.annotation.*;

import com.qunniox.airlines.entities.Flight;
import com.qunniox.airlines.services.FlightService;


@RestController
@RequestMapping
@CrossOrigin(origins="*",allowedHeaders="*")
@Transactional
public class FlightController {
	@Autowired
	FlightService flightService;

	@PostMapping("/addFlight")
	
	public void addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
	}

	@GetMapping("/allFlight")
	public Iterable<Flight> viewAllFlight() {
		return flightService.viewAllFlight();
	}

	@GetMapping("/viewFlight/{id}")
	
	public Flight viewFlight(@PathVariable ("id")Integer flightNo) {
		return flightService.viewFlight(flightNo);
	}

	@PutMapping("/updateFlight/{id}")
	
	public void modifyFlight(@PathVariable("id") Integer flightNo, @RequestBody Flight flight) {
		flight.setFlightNo(flightNo);
		flightService.modifyFlight(flight);
	}

	@DeleteMapping("/deleteFlight/{id}")
	
	public void removeFlight(@PathVariable ("id") Integer flightNo) {
		flightService.removeFlight(flightNo);
	}
}
