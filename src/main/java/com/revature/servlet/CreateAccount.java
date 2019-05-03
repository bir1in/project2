package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.User;
import com.revature.service.UserServiceImpl;

/**
 * Servlet implementation class CreateAccount
 */
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		System.out.println(username + " " + password1 + " " + password2);
		//response.setContentType("application/json");
		response.setContentType("application/json");
		//response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		response.setHeader("Access-Control-Allow-Origin", "*");
		PrintWriter out = response.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		if(username == null || username.equals("") || password1 == null || password1.equals("") || password2 == null || password2.equals("")) {
			out.write(mapper.writeValueAsString("All fields are required!"));
		}
		else if(!password1.equals(password2)) {
			out.write(mapper.writeValueAsString("Passwords must match!"));
		}
		else {
			User newUser = new User(0, username, password1);
			new UserServiceImpl().registerUser(newUser);
			response.sendRedirect("http://localhost:4200/project2/login");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
