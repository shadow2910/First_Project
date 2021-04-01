package com.cg.mvm.jpa_demo.onetomany_bi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	String location;							//"department" from Department department of Employee class
	@OneToMany(cascade = CascadeType.ALL,mappedBy="department")		//cascade makes updations automatic. if a value is update it gets updated in all subsequent table wherever it has been referenced
									//if we give DELETE instead of all it only works for delete updations
	
	List<Employee> employees;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptno, String departmentName, String location, List<Employee> employees) {
		super();
		this.deptno = deptno;
		this.departmentName = departmentName;
		this.location = location;
		this.employees = employees;
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
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", departmentName=" + departmentName + ", location=" + location
				+ ", employees=" + employees + "]";
	}
	
	
	
}
