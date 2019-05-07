package com.revature.service;

import java.util.List;

import com.revature.model.Starship;

public interface StarshipService {
	
	public List<Starship> getAllStarships();
	Starship getStarshipName(String name);
	Starship getStarshipCostInCredits(int cost_in_credits);
	Starship getStarShipPassengers(int passengers);
	Starship getStarshipCargo(int cargo);

}
