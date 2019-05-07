package com.revature.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Planet;
import com.revature.service.PlanetService;

@RestController("planetController")
@CrossOrigin(origins = "http://localhost:4200")
public class PlanetControllerImpl {

	private static Logger logger = Logger.getLogger(PlanetControllerImpl.class);
	
	@Autowired
	private PlanetService planetService;
	
	@GetMapping("/all")
	public List<Planet> findAllPlanets() {
		logger.trace("Getting list of all planets");
		return planetService.getAllPlanets();
	}
}
