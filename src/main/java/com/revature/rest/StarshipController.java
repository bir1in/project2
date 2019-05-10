package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.revature.model.SwapiStarship;

public interface StarshipController {

	List<SwapiStarship> findAllStarships();
	ResponseEntity<SwapiStarship> findAllStarships(SwapiStarship starship, HttpServletRequest request);
	
}
