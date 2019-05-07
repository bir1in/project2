package com.revature.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.model.Starship;
import com.revature.repository.StarshipRepository;

public class StarshipServiceImpl implements StarshipService{

	private static Logger logger = Logger.getLogger(StarshipServiceImpl.class);
	//Dependancy
	@Autowired
	private StarshipRepository starshipRepository;
	//@Autowired constructor injection
	public StarshipServiceImpl() {}

	//@Autowired constructor injection
	public StarshipServiceImpl(StarshipRepository starshipRepository) {
		logger.trace("Starship Constructor Injection");
		this.starshipRepository = starshipRepository;
	}
	
	//Autowired setter injection
	public void setHibernate(StarshipRepository starshipRepository) {
		this.starshipRepository = starshipRepository;
	}
	

	@Override
	public List<Starship> getAllStarships() {
		return starshipRepository.findAll();
	}
	public void setStarshipRepository(StarshipRepository starshipRepository) {
		this.starshipRepository = starshipRepository;
	}

	@Override
	public Starship getStarshipName(String name) {
		return starshipRepository.findByName(name);
	}

	@Override
	public Starship getStarshipCostInCredits(int cost_in_credits) {
		return starshipRepository.findByCostInCredits(cost_in_credits);
	}

	@Override
	public Starship getStarShipPassengers(int passengers) {
		return starshipRepository.findByPassengers(passengers);
	}

	@Override
	public Starship getStarshipCargo(int cargo) {
		return starshipRepository.findByCargo(cargo);
	}

}
