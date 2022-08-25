package com.rutu1.controller;

import com.rutu1.dto.EmployeeDTO;
import com.rutu1.services.EmployeeService;

public class EmployeeController {
	

	public void addEmployee(EmployeeDTO employeeDTO ) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.addEmployee(employeeDTO);
		
	}

}
