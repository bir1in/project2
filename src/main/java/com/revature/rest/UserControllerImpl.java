package com.revature.rest;

import static com.revature.util.ClientMessageUtil.INVALID_USER_DATA;
import static com.revature.util.ClientMessageUtil.REGISTRATION_SUCCESSFUL;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ajax.ClientMessage;
import com.revature.model.User;
import com.revature.service.UserService;

@RestController("userController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/user", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UserControllerImpl implements UserController {

	private static Logger logger = Logger.getLogger(UserControllerImpl.class);
	
	@Autowired
	private UserService userService;
	
	//getmapping == requestmapping(mehtod=requestmethod.GET)
	@GetMapping("/all")
	public List<User> findAllUsers() {
		logger.trace("Getting list of all users");
		return userService.getAllUsers();
	}

	@PostMapping("/register")
	public ResponseEntity<ClientMessage> registerUser(@RequestBody User user) {
		logger.trace("Registering new user " + user);
		return (userService.registerUser(user)) ? new ResponseEntity<>(REGISTRATION_SUCCESSFUL, HttpStatus.OK):new ResponseEntity<>(INVALID_USER_DATA, HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/find")
	public ResponseEntity<User> findUser(@RequestBody User user, HttpServletRequest request) {
		logger.trace("Finding user with name " + user);
		//request.getSession();
		User foundUser = userService.getUser(user.getUsername());
		if(foundUser != null) {
			return new ResponseEntity<>(foundUser, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
