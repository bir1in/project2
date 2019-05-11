package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ajax.ClientMessage;
import com.revature.service.swapi.SwapiPersonService;



@RestController("customerController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/user")
public class SwapiController {
	@Autowired
	private SwapiPersonService swapiService;
	
	@GetMapping("/findPeople")
	public ClientMessage findAllPeople() {
		//working on it right now
		//return swapiService.findSwapiPersonByName(id);
		
	}

}
