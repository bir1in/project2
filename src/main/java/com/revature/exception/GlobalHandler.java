package com.revature.exception;

import static com.revature.util.ClientMessageUtil.SOMETHING_WENT_WRONG;
import static com.revature.util.ClientMessageUtil.INVALID_USER_DATA;

import org.apache.log4j.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.revature.ajax.ClientMessage;

@ControllerAdvice
public class GlobalHandler {
	private static Logger logger = Logger.getLogger(GlobalHandler.class);
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ClientMessage> handleAnyException(Throwable t) {
		logger.error("Internal Error", t);
		return new ResponseEntity<>(SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(InvalidUserException.class)
	public ResponseEntity<ClientMessage> handleInvalidUserException(InvalidUserException e) {
		logger.error("Invalid user data detected", e);
		return new ResponseEntity<>(INVALID_USER_DATA, HttpStatus.BAD_REQUEST);
	}
}
