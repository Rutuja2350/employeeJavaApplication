package com.rutu1.ui;

import java.util.Scanner;

import com.rutu1.dto.EmployeeDTO;
import com.rutu1.controller.EmployeeController;

public class EmployeeUI {
	
	public EmployeeUI(){
		
		System.out.println("Welcome...");
		userOptions();
		
	}

	private void userOptions() {

		System.out.println("Select appropriate option : ");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. View Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. View All Employees");
		System.out.println("6. Exit");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		doTask(choice);
		
	}

	private void doTask(int choice) {

		switch(choice) {
		
			case 1 : {
						addEmployee();
						userOptions();
					}
			case 2 : {
						updateEmployee();
						userOptions();
					}
			case 3 : {
						viewEmployee();
						userOptions();
					}
			case 4 : {
						deleteEmployee();
						userOptions();
					}
			case 5 : {
						viewAllEmployee();
						userOptions();
					}
			case 6 : {
						closeApp();
					}
			default : {
						throw new IllegalArgumentException("Unexpected value: " + choice);
					}
		
		}
		
	}

	private void viewAllEmployee() {

		
		
	}

	private void deleteEmployee() {

		
		
	}

	private void viewEmployee() {

		
		
	}

	private void updateEmployee() {

		
		
	}

	private void addEmployee() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter id : ");
		int id = scanner.nextInt();
		System.out.println("Enter Name : ");
		String name = scanner.next();
		System.out.println("Enter City : ");
		String city = scanner.next();
		
		EmployeeDTO empDto = new EmployeeDTO(id, name, city);
		
		EmployeeController employeeController = new EmployeeController();
		employeeController.addEmployee(empDto);

		
	}

	private void closeApp() {

		System.exit(0);
		
	}

}
