package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.revature.ajax.ClientMessage;
import com.revature.model.User;

public interface UserController {
	ResponseEntity<ClientMessage> registerUser(User user);
	List<User> findAllUsers();
	ResponseEntity<User> findUser(User user, HttpServletRequest request);
}
