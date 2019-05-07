package com.revature.repository;

import java.util.List;

import com.revature.model.Starship;

public interface StarshipRepository {

	void save(Starship starship);
	List<Starship> findAll();
	Starship findByName(String name);
	// TODO: verify name of int
	Starship findByCostInCredits(int cost_in_credits);
	Starship findByPassengers(int passengers);
	Starship findByCargo(int cargo);
}
