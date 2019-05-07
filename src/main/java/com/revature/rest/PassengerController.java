package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.revature.model.Passenger;

public interface PassengerController {
	
	List<Passenger> findAllPassengers();
	ResponseEntity<Passenger> findAllPassengers(Passenger passenger, HttpServletRequest request);
		
//	List<Planet> findAllPlanets();
//	ResponseEntity<Planet> findAllPlanets(Planet planet, HttpServletRequest request);
//		
//	List<Starship> findAllStarships();
//	ResponseEntity<Starship> findAllStarships(Starship starship, HttpServletRequest request);
//	

}
