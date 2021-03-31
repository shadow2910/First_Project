package com.cg.mvm.JPAdemo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity				//indicate that this class is entity-"The class which is mappped to table and objects created will be persistent.
@Table(name="employee")	//table to class mapping.This statement is optional if class and table have same name
public class Employee {
	
	@Id				//mapped to primary key column. Even if emp_no is not primary key. Hibernate treats this as primary key
	//Each class data member should be mapped with appropriate column
	@Column(name="emp_no")		//mapping each column to one one property of class
	int empid;
	@Column(name="emp_name")
	String ename;
	@Column(name="emp_sal")	//if both column name and variable name are same no need for this statement
	double salary;
	@Column (name="doj")
	LocalDate obj;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, double salary, LocalDate obj) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.obj = obj;
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

	public LocalDate getObj() {
		return obj;
	}

	public void setObj(LocalDate obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", obj=" + obj + "]";
	}

}
