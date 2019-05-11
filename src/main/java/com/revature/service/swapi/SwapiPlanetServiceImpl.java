    
package com.revature.service.swapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.revature.model.SwapiPlanet;

@Service()
public class SwapiPlanetServiceImpl implements SwapiPlanetService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public SwapiPlanet findSwapiPlanetByName(int id) {
		return restTemplate.getForObject("https://swapi.co/api/planets/" + id, SwapiPlanet.class);
	}

	
}