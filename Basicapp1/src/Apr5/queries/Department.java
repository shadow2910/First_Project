package com.cg.mvm.jpa_demo.queries;
import javax.persistence.NamedQueries;

import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//NamedQueries is used to create query in entity class itself which can be referred later
@NamedQueries(value= {@NamedQuery(name="getDepartmentByDeptno",query="select d from Department d where d.deptno=:dno1 or d.deptno=:dno2"),
					  @NamedQuery(name="getDepartmentByLocation",query="select d from Department d where d.location=:loc")
})
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
