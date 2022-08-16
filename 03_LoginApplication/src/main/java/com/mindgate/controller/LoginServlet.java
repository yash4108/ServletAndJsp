package com.mindgate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId, password;
		userId = req.getParameter("username");
		password = req.getParameter("password");
		if (userId.equals("admin") && password.equals("Bahubali")) {

			resp.sendRedirect("home.html");
		} else {
			resp.sendRedirect("invalid.html");
		}

	}
}
