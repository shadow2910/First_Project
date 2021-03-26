package com.cg.jdbcdemo.service;
import java.time.LocalDate;
import java.util.List;

import com.cg.jdbcdemo.dao.EmployeeDAO;
import com.cg.jdbcdemo.dto.Employee;
public class EmployeeService {
	static EmployeeDAO edao=new EmployeeDAO();
	
	public List<Employee> getAllEmployees(){
		return edao.getAllEmployees();
	}
	
	public Employee getEmployee(int empid) {
		Employee emp=null;
		try {
			emp=edao.getEmployee(empid);
		}
		catch(RuntimeException ex) {
			System.out.println(ex);
		}
		return emp;
	}
	
	public String deleteEmployee(int empid) {
		if(edao.deleteEmployee(empid))
			return "Employee Deleted Successfully";
		return  "Emoloyee cannot be deleted";
	}
	
	public String insertEmployee(int empid,String ename,double salary,LocalDate doj) {
		if(edao.insertEmployee(new Employee(empid,ename,salary,doj)))
			return "Employee added successfully";
		return "Employee cannot be added";
	}
	public String modifyEmployee(int empid,String newEname,double newSalary) {
		Employee e=new Employee(empid,newEname,newSalary,null);
		try {
			edao.modifyEmployee(e);
			return "Employee Details Modified Successfully";
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return "";
	}
}
