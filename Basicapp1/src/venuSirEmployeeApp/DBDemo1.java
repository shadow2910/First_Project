package com.cg.jdbcdemo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.jdbcdemo.dto.Employee;
import com.cg.jdbcdemo.service.EmployeeService;
import java.time.LocalDate;
public class DBDemo1 {
	
	EmployeeService employeeService=new EmployeeService();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			mainMenu(sc);
		}
	}
	public static void mainMenu(Scanner sc) {
		System.out.println("1.Add employee Details");
		System.out.println("2.Display Employee Details");
		System.out.println("3.Display all employee Details");
		System.out.println("4.Modify employee Details");
		System.out.println("5.Delete employee Details");
		System.out.println("6.EXIT");
		System.out.println("Select your option");
		int opt=Integer.parseInt(sc.nextLine());
		switch(opt) {
		case 1:
			addEmployeeDetails(sc);
			break;
		case 2:
			displayEmployeeDetails(sc);
			break;
		case 3:
			displayAllEmployeeDetails();
			break;
		case 4:
			modifyEmployeeDetails(sc);
			break;
		case 5:
			deleteEmployeeDetails(sc);
			break;
		case 6:
			System.exit(1);
		default:
			System.out.println("Sorry wrong option");
		}
	}
	
	public static void addEmployeeDetails(Scanner sc) {
		System.out.println("Enter Employee id");
		int empid=Integer.parseInt(sc.nextLine());
		System.out.println("Enter employee name");
		String ename=sc.nextLine();
		System.out.println("Enter employee salary");
		double salary=Double.parseDouble(sc.nextLine());
		System.out.println("Enter Employee DOJ(yyyy-mm-dd");
		String doj=sc.nextLine();
		DBDemo1 obj=new DBDemo1();
		obj.employeeService.insertEmployee(empid,ename,salary,LocalDate.parse(doj));
	}
	public static void displayEmployeeDetails(Scanner sc) {
		System.out.println("Enter employee id");
		int empid=Integer.parseInt(sc.nextLine());
		Employee e=new DBDemo1().employeeService.getEmployee(empid);
		if(e!=null) {
			System.out.println(e);
		}
		else
			System.out.println("Employee doesn't exist");
	}
	public static void displayAllEmployeeDetails() {
		List<Employee> emplist = new ArrayList<>();
		emplist=new DBDemo1().employeeService.getAllEmployees();
		for(Employee e:emplist) {
			System.out.println(e);
		}
	}
	public static void modifyEmployeeDetails(Scanner sc) {
		System.out.println("Enter employee id");
		int empid=Integer.parseInt(sc.nextLine());
		System.out.println("Enter employee name");
		String ename=sc.nextLine();
		System.out.println("Enter employee salary");
		double salary=Double.parseDouble(sc.nextLine());
		System.out.println(new DBDemo1().employeeService.modifyEmployee(empid, ename, salary));
	}
	public static void deleteEmployeeDetails(Scanner sc) {
		System.out.println("Enter employee id");
		int empid=Integer.parseInt(sc.nextLine());
		System.out.println(new DBDemo1().employeeService.deleteEmployee(empid));
		}
}
