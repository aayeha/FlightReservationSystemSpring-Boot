package com.qunniox.airlines.dao;

import org.springframework.data.repository.CrudRepository;
import java.math.BigInteger;
import org.springframework.stereotype.Repository;

import com.qunniox.airlines.entities.Booking;

@Repository
public interface BookingDao extends CrudRepository<Booking, Integer> {

}
