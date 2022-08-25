package com.rutu1.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

import com.rutu1.dto.EmployeeDTO;

public class EmployeeDAO{
		
	public void saveEmployee(EmployeeDTO employeeDTO) throws Exception{
		
		    int id = employeeDTO.getId();
			String name = employeeDTO.getName();
			String city = employeeDTO.getCity();
			

//			Driver driver = new com.mysql.cj.jdbc.Driver();
//
//			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/rutuja";
			Connection con = DriverManager.getConnection(url, "root", "root");
			
			String sql = "select * from employee;";
			String sql1 = "insert into employee values("+id+",'"+name+"','"+city+"');";
			
			Statement st = con.createStatement();
			
			st.executeUpdate(sql1);
			ResultSet rs=  st.executeQuery(sql);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int count = rsmd.getColumnCount();
			
			while(rs.next()) {
				for(int i =1; i<=count;i++) {
					System.out.print(rs.getObject(i) + " : ");
				}
				System.out.println("");
			}
			
//			System.out.println(count);
//			
//			System.out.println(rsmd.getColumnName(1));
//			int type = rsmd.getColumnType(1);
//			
//			rs.next();
//			System.out.println(rs.getObject(1));
//			
			
			
			//System.out.println(columnType);
			
//			while(rs.next()) {
//				String userid = rs.getString("");
//				System.out.println(userid);
//			}
			System.out.println("ok fine");

		}

}
