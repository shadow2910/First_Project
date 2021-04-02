package com.cg.mvm.jpa_demo.inheritanceTPCC;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)	//inheritance strategy-no table is created for this class
@Entity
public abstract class Employee3 {
	
	@Id
	@Column(name="empid")
	int empid;
	@Column(name="ename")
	String ename;
	public Employee3() {
		super();
	}
	public Employee3(int empid, String ename) {
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
