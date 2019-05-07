package com.revature.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Starship;
import com.revature.service.StarshipService;

@RestController("starshipController")
@CrossOrigin(origins = "http://localhost:4200")

public class StarshipControllerImpl {

	private static Logger logger = Logger.getLogger(StarshipControllerImpl.class);
	
	@Autowired
	private StarshipService starshipService;
	
	@GetMapping("/all")
	public List<Starship> findAllStarships() {
		logger.trace("Getting list of all starships)");
		return starshipService.getAllStarships();
	}
}
