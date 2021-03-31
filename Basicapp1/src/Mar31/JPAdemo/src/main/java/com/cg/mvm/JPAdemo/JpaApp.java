package com.cg.mvm.JPAdemo;

import java.time.LocalDate;

import com.cg.mvm.JPAdemo.entity.Employee;
import com.cg.mvm.JPAdemo.service.EmployeeService;
import com.cg.mvm.JPAdemo.service.EmployeeServiceImpl;

public class JpaApp {
		
	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		Employee emp=new Employee(107,"JamesBond",7000,LocalDate.now());
		employeeService.insertEmployee(emp);
		
		Employee emp2=employeeService.getEmployee(105);
		if(emp2!=null) {
			emp2.setEname("John Travolta");
			emp2.setSalary(7860);
			employeeService.modifyEmployee(emp2);
		}
		
		Employee emp3=employeeService.getEmployee(701);
		if(emp3!=null)
			System.out.println(emp3);
		
		employeeService.deleteEmployee(704);
		
	}
}
