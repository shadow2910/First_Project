package com.cg.mvm.jpa_demo.inheritanceTPH;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Inheritance(strategy=InheritanceType.JOINED)	//inheritance strategy
@Entity
@Table(name="employee")
public class Employee2{
	
	@Id
	@Column(name="empid")
	int empid;
	@Column(name="ename")
	String ename;
	public Employee2() {
		super();
	}
	public Employee2(int empid, String ename) {
		super();
		this.empid=empid;
		this.ename=ename;
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
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}
	
}
