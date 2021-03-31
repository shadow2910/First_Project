package com.cg.mvm.JPAdemo.service;

import com.cg.mvm.JPAdemo.entity.Employee;

public interface EmployeeService {

	public void insertEmployee(Employee emp);
	public Employee getEmployee(int empid);
	public void modifyEmployee(Employee e);
	public void deleteEmployee(int empid);
}
