package com.qunniox.airlines.dao;

import org.springframework.data.repository.CrudRepository;
import java.math.BigInteger;
import org.springframework.stereotype.Repository;

import com.qunniox.airlines.entities.Flight;

@Repository
public interface FlightDao extends CrudRepository<Flight,Integer>{

}
