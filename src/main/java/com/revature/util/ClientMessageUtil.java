package com.revature.util;

import com.revature.ajax.ClientMessage;

public class ClientMessageUtil {
	public static final ClientMessage REGISTRATION_SUCCESSFUL = new ClientMessage("User registered successfully");
	public static final ClientMessage SOMETHING_WENT_WRONG = new ClientMessage("Something went wrong");
	public static final ClientMessage INVALID_USER_DATA = new ClientMessage("Invalid user data");
}
