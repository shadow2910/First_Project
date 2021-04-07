package com.cg.spring.beanlistinjection.bean;

import java.util.List;

public class SBU {

	String sbuCode;
	String sbuHead;
	String sbuName;
	List<Employee> employees;
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SBU(String sbuCode, String sbuHead, String sbuName, List<Employee> employees) {
		super();
		this.sbuCode = sbuCode;
		this.sbuHead = sbuHead;
		this.sbuName = sbuName;
		this.employees = employees;
	}

	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + ", employees=" + employees
				+ "]";
	}

	
	
}
