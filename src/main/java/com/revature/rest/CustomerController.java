package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ajax.ClientMessage;

import com.revature.model.SwapiPerson;
import com.revature.model.SwapiPlanet;
import com.revature.model.SwapiStarship;
import com.revature.model.User;
import com.revature.service.UserService;
import com.revature.service.swapi.SwapiPersonService;
import com.revature.service.swapi.SwapiPlanetService;
import com.revature.service.swapi.SwapiStarshipService;

@RestController("customerController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/user")
public class CustomerController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private SwapiPersonService swapiService;
	@Autowired 
	private SwapiPlanetService swapiPService;
	@Autowired 
	private SwapiStarshipService swapiSService;
	@PostMapping("/register")
	public ClientMessage register(@RequestBody User user) {
		if(userService.registerUser(user)) {
			return new ClientMessage("User registered successfully");
		} else {
			return new ClientMessage("Something went wrong");
		}
	}
	@GetMapping("/findPeople")
	public SwapiPerson findPeopleById() {
		return swapiService.findSwapiPersonById();
	}
	@GetMapping("/findPlanet")
	public SwapiPlanet findPlanetById() {
		return swapiPService.findSwapiPlanetById();
	}
	@GetMapping("/findStarship")
	public SwapiStarship findStarshipById() {
		return swapiSService.findSwapiStarshipById();
	}
	
}
