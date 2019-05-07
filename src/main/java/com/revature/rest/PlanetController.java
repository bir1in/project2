package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Planet;

//@RestController("planetController")
//@CrossOrigin(origins = "http://localhost:4200")
public interface PlanetController {

	List<Planet> findAllPlanets();
	ResponseEntity<Planet> findAllPlanets(Planet planet, HttpServletRequest request);
	
}
