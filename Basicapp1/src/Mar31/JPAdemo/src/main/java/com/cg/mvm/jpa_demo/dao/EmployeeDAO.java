package com.cg.mvm.jpa_demo.dao;

import com.cg.mvm.JPAdemo.entity.Employee;

public interface EmployeeDAO {

	public void insertEmployee(Employee emp);
	public Employee getEmployee(int empid);
	public void modifyEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public void beginTransaction();
	public void commitTransaction();
}
