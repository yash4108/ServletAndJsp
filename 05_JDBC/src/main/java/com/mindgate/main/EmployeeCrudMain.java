package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCrudMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		int choice;
		double salary;
		int resume;
		List<Employee> allEmployees;
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		do {
			System.out.println("1.Add new employee ");
			System.out.println("2.update employee ");
			System.out.println("3.delete employee ");
			System.out.println("4.select one employee ");
			System.out.println("5.select all  employee ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:

				System.out.println("enter id");
				employeeId = scanner.nextInt();
				System.out.println("enter name");
				scanner.nextLine();
				name = scanner.nextLine();
				System.out.println("enter salary");
				salary = scanner.nextDouble();

				Employee employee = new Employee(employeeId, name, salary);
				boolean result = employeeServiceInterface.addNewEmployee(employee);
				if (result) {
					System.out.println("insert success");
				} else {
					System.out.println("insert failed");
				}

				break;

			case 5:
				allEmployees = employeeServiceInterface.getAllEmployees();
				for (Employee e : allEmployees) {
					System.out.println(e);
				}

				break;
			case 3:
				System.out.println("enter id");
				
				employeeId = scanner.nextInt();
				result = employeeServiceInterface.deleteEmployeeByEmployeeId(employeeId);
				if (result) {
					System.out.println("delete success");
				} else {
					System.out.println("delete failed");
				}

				break;
			case 2:

//				System.out.println("set name to");
//				scanner.nextLine();
//				name = scanner.nextLine();
//				
//
//				System.out.println("emp id");
//				employeeId = scanner.nextInt();
//				scanner.nextLine();
//
//				result = employeeServiceInterface.updateEmployee(employee);
//
//				if (result) {
//					System.out.println("update succesfull");
//				} else {
//					System.out.println("update failed");
//				}
				break;

			}
			System.out.println("do u want to continue press 1");
			resume = scanner.nextInt();
		} while (resume == 1);

	}
}
