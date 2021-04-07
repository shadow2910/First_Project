package com.cg.spring.beanlistinjection.bean;

public class Employee {
	
	int empid;
	String ename;
	double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String ename, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
}
