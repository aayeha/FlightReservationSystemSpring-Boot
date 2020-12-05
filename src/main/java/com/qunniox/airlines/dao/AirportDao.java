package com.qunniox.airlines.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.qunniox.airlines.entities.Airport;

//Its findById() method retrieves an entity by its id. The return value is Optional<T>.

//Optional<T> is a container object which may or may not contain a non-null value. If a value is present, isPresent() returns true and get() returns the value.

//The ifPresent() invokes the specified method if the value is present; otherwise nothing is done.

public interface AirportDao extends CrudRepository<Airport, String> {
	
	//public Airport addAirport(Airport airport);
	
	//public List<Airport> findAllAirports();
	
	//public Airport updateProduct(Airport airport);
	
	//public Airport deleteProduct(String  airportCode);
	//public Airport viewAirport(String  airportCode);
	
	
	//Optional<T> findById(ID id)
	//Iterable<T> findAll()
	//void deleteById(ID id)
}