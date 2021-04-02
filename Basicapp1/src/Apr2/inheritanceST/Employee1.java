package com.cg.mvm.jpa_demo.inheritanceST;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)	//inheritance strategy
@DiscriminatorColumn(name="type")					//discriminator column decides typ
@Entity
public class Employee1 {
	
	@Id
	@Column(name="empid")
	int empid;
	@Column(name="ename")
	String ename;
	public Employee1() {
		super();
	}
	public Employee1(int empid, String ename) {
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
