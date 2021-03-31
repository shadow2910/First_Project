package com.cg.mvm.JPAdemo.service;

import com.cg.mvm.JPAdemo.entity.Employee;
import com.cg.mvm.jpa_demo.dao.EmployeeDAO;
import com.cg.mvm.jpa_demo.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDAO edao=new EmployeeDAOImpl();
	
	@Override
	public void insertEmployee(Employee emp) {
		edao.beginTransaction();
		edao.insertEmployee(emp);
		edao.commitTransaction();
	}

	@Override
	public Employee getEmployee(int empid) {
		return edao.getEmployee(empid);
	}

	@Override
	public void modifyEmployee(Employee e) {
		edao.beginTransaction();
		edao.modifyEmployee(e);
		edao.commitTransaction();
	}

	@Override
	public void deleteEmployee(int empid) {
		Employee e=edao.getEmployee(empid);
		if(e!=null) {
			edao.beginTransaction();
			edao.deleteEmployee(e);
			edao.commitTransaction();
		}
		else
			System.out.println("Employee with id "+empid+" not found");
		
	}
	
}
