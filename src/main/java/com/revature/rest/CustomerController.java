package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ajax.ClientMessage;
import com.revature.model.User;
import com.revature.service.UserService;

@RestController("customerController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/user")
public class CustomerController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ClientMessage register(@RequestBody User user) {
		if(userService.registerUser(user)) {
			return new ClientMessage("User registered successfully");
		} else {
			return new ClientMessage("Something went wrong");
		}
	}
	
}
