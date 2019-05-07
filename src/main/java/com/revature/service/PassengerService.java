package com.revature.service;

import java.util.List;

import com.revature.model.Passenger;

public interface PassengerService {
	
	public List<Passenger> getAllPassengers();
	Passenger getPassengerName(String name);
	Passenger getPassengerHomeWorld(String homeWorld);

}
