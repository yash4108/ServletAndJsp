package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	int employeeId;
	String name;
	double salary;
	
       
    public AddEmployeeServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	employeeId=Integer.parseInt(request.getParameter("employeeid"));
	name=request.getParameter("employeename");
	salary=Double.parseDouble(request.getParameter("salary"));
	 Employee employee = new Employee(employeeId, name, salary);
	EmployeeServiceInterface employeeServiceInterface=new EmployeeService();
	 boolean result =employeeServiceInterface.addNewEmployee(employee);
	 if(result) {
		 
		 response.sendRedirect("index.jsp");
	 }else {
		 PrintWriter out=response.getWriter();
		 out.println("failed to add");
	 }
	
//	PrintWriter out=response.getWriter();
//	out.println("employeeId:"+employeeId); 
//	out.println("name:"+name);
//	out.println("salary:"+salary);

	}

}
