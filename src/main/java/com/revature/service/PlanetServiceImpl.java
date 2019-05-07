package com.revature.service;

import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Planet;
import com.revature.repository.PlanetRepository;

@Service("planetService")
public class PlanetServiceImpl implements PlanetService{

	
	private static Logger logger = Logger.getLogger(PlanetServiceImpl.class);
	//Dependancy
	@Autowired
	private PlanetRepository planetRepository;
	//@Autowired constructor injection
	public PlanetServiceImpl() {}

	//@Autowired constructor injection
	public PlanetServiceImpl(PlanetRepository planetRepository) {
		logger.trace("Planet Constructor Injection");
		this.planetRepository = planetRepository;
	}
	
	//Autowired setter injection
	public void setHibernate(PlanetRepository planetRepository) {
		this.planetRepository = planetRepository;
	}
	

	@Override
	public List<Planet> getAllPlanets() {
		return planetRepository.findAll();
	}
	public void setPlanetRepository(PlanetRepository planetRepository) {
		this.planetRepository = planetRepository;
	}

	@Override
	public Planet getPlanetName(String name) {
		return planetRepository.findByName(name);
	}

}
