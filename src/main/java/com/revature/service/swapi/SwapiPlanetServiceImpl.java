    
package com.revature.service.swapi;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.revature.model.SwapiPlanet;

@Service()
public class SwapiPlanetServiceImpl implements SwapiPlanetService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public SwapiPlanet findSwapiPlanetById() {
		Random rn = new Random();
		int id = rn.nextInt(61 - 1 + 1) + 1;
		return restTemplate.getForObject("https://swapi.co/api/planets/" + id, SwapiPlanet.class);
	}

	
}