package com.revature.service;

import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.exception.InvalidUserException;
import com.revature.model.User;
import com.revature.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	//Dependency
	@Autowired
	private UserRepository userRepository;
	//@Autowaired constructor injection
	public UserServiceImpl() {}
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	//@Autowired constructor injection
	public UserServiceImpl(UserRepository userRepository) {
		logger.trace("Constructor Injection");
		this.userRepository = userRepository;
	}
	
	//@Autowired setter injection
	public void setHibernate(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public boolean registerUser(User user) {
		if(user.getUsername().contentEquals("")) {
			throw new InvalidUserException("User name cannot be empty");
		}
		
		logger.info(userRepository != null);
		
		userRepository.save(user);
		return user.getId() != 0;
	}

	@Override
	public User getUser(String username) {
		return userRepository.findByName(username);
	}
}
