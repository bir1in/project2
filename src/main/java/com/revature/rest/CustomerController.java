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
	
	//DONT USE THIS
	
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
	@PostMapping("/find")
	public User find(@RequestBody String username) {
		User newUser = userService.getUser(username);
		System.out.println(newUser);
		/*if(newUser != null) {
			return new User(newUser.getId(), newUser.getUsername(), newUser.getPassword());
		} else {
			return new User();
		}*/
		return newUser;
	}
}
