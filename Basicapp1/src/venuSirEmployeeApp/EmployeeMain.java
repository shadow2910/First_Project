package com.cg.jdbcdemo.main;



import java.time.LocalDate;
import java.util.List;

import com.cg.jdbcdemo.dto.Employee;
import com.cg.jdbcdemo.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeService employeeService=new EmployeeService();
		
		System.out.println(employeeService.insertEmployee(106, "Ankur", 8000, LocalDate.of(21, 2, 18)));
		
		System.out.println(employeeService.modifyEmployee(102, "Babu Raja", 2200));
		System.out.println(employeeService.deleteEmployee(103));
		List<Employee> elist=employeeService.getAllEmployees();
		for(Employee e:elist) {
			System.out.println(e);
		}
		System.out.println("-----xxxxx----");
		Employee e1=employeeService.getEmployee(106);
		if(e1!=null)
			System.out.println(e1);
		System.out.println("-----xxxxx----");
		System.out.println(employeeService.deleteEmployee(106));
		List<Employee> elist2=employeeService.getAllEmployees();
		for(Employee e:elist2) {
			System.out.println(e);
		}
		
		
	}
}
