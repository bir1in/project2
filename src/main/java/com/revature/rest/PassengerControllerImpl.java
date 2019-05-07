package com.revature.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Passenger;
import com.revature.service.PassengerService;

@RestController("passengerController")
@CrossOrigin(origins = "http://localhost:4200")

//Not sure if RequestMapping is necessary
//@RequestMapping(path = "")
public class PassengerControllerImpl {

	private static Logger logger = Logger.getLogger(PassengerControllerImpl.class);

	@Autowired
	private PassengerService passengerService;

	@GetMapping("/all")
	public List<Passenger> findAllPassengers() {
		logger.trace("Getting list of all passengers");
		return passengerService.getAllPassengers();
	}
	
	
	
	
}






