    
package com.revature.service.swapi;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Input;
import com.revature.model.SwapiPerson;

@Service()
public class SwapiPersonServiceImpl implements SwapiPersonService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public SwapiPerson findSwapiPersonById() {
		Random rn = new Random();
		int id = rn.nextInt(88 - 1 + 1) + 1;
		System.out.println("This is the test ");
		return restTemplate.getForObject("https://swapi.co/api/people/"+id, SwapiPerson.class);
	}

	
}