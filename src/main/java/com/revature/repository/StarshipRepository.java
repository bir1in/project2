package com.revature.repository;

import java.util.List;

import com.revature.model.SwapiStarship;

public interface StarshipRepository {

	void save(SwapiStarship starship);
	List<SwapiStarship> findAll();
	SwapiStarship findByName(String name);
	// TODO: verify name of int
	SwapiStarship findByCostInCredits(int cost_in_credits);
	SwapiStarship findByPassengers(int passengers);
	SwapiStarship findByCargo(int cargo);
}
