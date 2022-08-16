package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {

	

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int num1 = Integer.parseInt( req.getParameter("number1"));
	int num2= Integer.parseInt( req.getParameter("number2"));
	String choice =req.getParameter("operation");
	PrintWriter out =resp.getWriter();
	switch (choice) {
	case "add": {
		out.println("addition of"+num1+"and"+num2+"is"+(num1+num2));
		break;
	}
	case "sub": {
		out.println("subtraction of"+num1+"and"+num2+"is"+(num1-num2));
		break;
	}
	}
	
	

}}
