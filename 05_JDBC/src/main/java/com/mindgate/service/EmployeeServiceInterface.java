package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeServiceInterface {
boolean addNewEmployee(Employee employee);
List<Employee> getAllEmployees(); 
boolean deleteEmployeeByEmployeeId(int employeeId);
public boolean updateEmployee(Employee employee);
public Employee getEmployeeByEmployeeId(int employeeId);
}

