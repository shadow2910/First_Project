package com.cg.mvm.jpa_demo.onetomany_uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="emp_no")
	int empid;
	@Column(name="emp_sal")
	double salary;
	@Column(name="emp_name")
	String name;
	@Column(name="deptno")
	int deptno;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, double salary, String name, int deptno) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
		this.deptno = deptno;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + ", deptno=" + deptno + "]";
	}
	

}
