    
package com.revature.service.swapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.SwapiPerson;

@Service()
public class SwapiPersonServiceImpl implements SwapiPersonService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public SwapiPerson findSwapiPersonByName(int id) {
		return restTemplate.getForObject("https://swapi.co/api/people/" + id, SwapiPerson.class);
	}

	
}