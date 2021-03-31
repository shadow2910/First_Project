package com.cg.mvm.jpa_demo.dao;

import javax.persistence.EntityManager;

import com.cg.mvm.JPAdemo.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	EntityManager eManager;
	public EmployeeDAOImpl() {
		eManager=JpaUtils.getEntityManager();
	}
	@Override
	public void insertEmployee(Employee e) {
		eManager.persist(e);
	}
	@Override
	public Employee getEmployee(int empid) {
		return eManager.find(Employee.class, empid);
	}
	@Override
	public void modifyEmployee(Employee e) {
		eManager.merge(e);
	}
	@Override
	public void deleteEmployee(Employee emp) {
		eManager.remove(emp);
	}
	@Override
	public void beginTransaction() {
		eManager.getTransaction().begin();
	}
	
	@Override
	public void commitTransaction() {
		eManager.getTransaction().commit();
	}
}
