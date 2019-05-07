package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.revature.model.Starship;

public interface StarshipController {

	List<Starship> findAllStarships();
	ResponseEntity<Starship> findAllStarships(Starship starship, HttpServletRequest request);
	
}
