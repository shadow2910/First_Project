package com.cg.mvm.jpa_demo.queries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@Column(name="dep_no")
	int deptno;
	@Column(name="dep_name")
	String departmentName;
	@Column(name="dep_loc")
	String location;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptno, String departmentName, String location) {
		super();
		this.deptno = deptno;
		this.departmentName = departmentName;
		this.location = location;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", departmentName=" + departmentName + ", location=" + location + "]";
	}
	
}
