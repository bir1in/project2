package com.revature.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.model.Passenger;
import com.revature.repository.PassengerRepository;

public class PassengerServiceImpl implements PassengerService{

	private static Logger logger = Logger.getLogger(PassengerServiceImpl.class);
	//Dependancy
	@Autowired
	private PassengerRepository passengerRepository;
	//@Autowired constructor injection
	public PassengerServiceImpl() {}

	//@Autowired constructor injection
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		logger.trace("Passenger Constructor Injection");
		this.passengerRepository = passengerRepository;
	}
	
	//Autowired setter injection
	public void setHibernate(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}
	

	@Override
	public List<Passenger> getAllPassengers() {
		return passengerRepository.findAll();
	}
	public void setPassengerRepository(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Passenger getPassengerName(String name) {
		return passengerRepository.findByName(name);
	}

	@Override
	public Passenger getPassengerHomeWorld(String homeWorld) {
		return passengerRepository.findByHomeWorld(homeWorld);
	}

}


