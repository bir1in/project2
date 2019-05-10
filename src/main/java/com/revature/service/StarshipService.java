package com.revature.service;

import java.util.List;

import com.revature.model.SwapiStarship;

public interface StarshipService {
	
	public List<SwapiStarship> getAllStarships();
	SwapiStarship getStarshipName(String name);
	SwapiStarship getStarshipCostInCredits(int cost_in_credits);
	SwapiStarship getStarShipPassengers(int passengers);
	SwapiStarship getStarshipCargo(int cargo);

}
