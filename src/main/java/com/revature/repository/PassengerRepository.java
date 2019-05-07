package com.revature.repository;

import java.util.List;

import com.revature.model.Passenger;

public interface PassengerRepository {
	void save(Passenger passenger);
	List<Passenger> findAll();
	Passenger findByName(String name);
	Passenger findByHomeWorld(String name);

}
