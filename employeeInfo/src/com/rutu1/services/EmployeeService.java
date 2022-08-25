package com.rutu1.services;

import com.rutu1.dao.EmployeeDAO;
import com.rutu1.dto.EmployeeDTO;

public class EmployeeService {
	
	public void addEmployee(EmployeeDTO employeeDTO) {
		
		employeeDTO.setId(employeeDTO.getId());
		employeeDTO.setName(employeeDTO.getName().toUpperCase());
		employeeDTO.setCity(employeeDTO.getCity().toUpperCase());
		EmployeeDAO dao = new EmployeeDAO();
		try {
			dao.saveEmployee(employeeDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
