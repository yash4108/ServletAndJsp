package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		System.out.println("enter id");
		int empId = scanner.nextInt();
		System.out.println("enter name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("enter salary");
		double salary = scanner.nextDouble();

		Employee employee = new Employee(empId, name, salary);
		boolean result = employeeServiceInterface.addNewEmployee(employee);
		if (result) {
			System.out.println("insert success");
		} else {
			System.out.println("insert failed");
		}

	}
}
