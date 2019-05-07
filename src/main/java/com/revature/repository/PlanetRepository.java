package com.revature.repository;

import java.util.List;

import com.revature.model.Planet;

public interface PlanetRepository {
	void save(Planet planet);
	List<Planet> findAll();
	Planet findByName(String name);
}
