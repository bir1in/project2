package com.revature.service;

import java.util.List;

import com.revature.model.Planet;

public interface PlanetService {
	
	public List<Planet>getAllPlanets();
	Planet getPlanetName(String name);

}
