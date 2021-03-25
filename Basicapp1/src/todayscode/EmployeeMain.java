package com.cg.jdbcdemo.main;



import java.time.LocalDate;
import java.util.List;

import com.cg.jdbcdemo.dto.Employee;
import com.cg.jdbcdemo.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeService employeeService=new EmployeeService();
		List<Employee> elist=employeeService.getAllEmployees();
		System.out.println(employeeService.insertEmployee(105, "Rajan", 5000, LocalDate.of(21, 2, 18)));
		/*
		System.out.println(employeeService.modifyEmployee(102, "Raja Babu", 2200));
		System.out.println(employeeService.deleteEmployee(103));
		System.out.println(employeeService.deleteEmployee(110));
		System.out.println("-----xxxxx----");
		Employee e1=employeeService.getEmployee(104);
		if(e1!=null)
			System.out.println(e1);
		System.out.println("-----xxxxx----");
		*/
		for(Employee e:elist) {
			System.out.println(e);
		}
		
	}
}
