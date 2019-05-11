package com.revature.service.swapi;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.SwapiStarship;

@Service
public class SwapiStarshipServiceImpl implements SwapiStarshipService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public SwapiStarship findSwapiStarshipById() {
		Random rn = new Random();
		int id = rn.nextInt(15 - 1 + 1) + 1;
		return restTemplate.getForObject("https://swapi.co/api/starships/" + id+1, SwapiStarship.class);
	}
}
