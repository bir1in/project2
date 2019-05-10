package com.revature.service.swapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.SwapiStarship;

@Service
public class SwapiStarshipServiceImpl implements SwapiStarshipService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public SwapiStarship findSwapiStarshipByName(int id) {
		return restTemplate.getForObject("https://swapi.co/api/starships/" + id, SwapiStarship.class);
	}

}
