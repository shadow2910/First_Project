package com.cg.mvm.JPAdemo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.mvm.JPAdemo.entity.Employee;

public class App3 {
	public static void main(String[] args) {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		 EntityManager eManager=emf.createEntityManager();
		 EntityTransaction trans=eManager.getTransaction();
		 Employee emp=new Employee();
		 Employee emp2=new Employee(106,"foolish",6000,LocalDate.now());
				 
		 emp.setEmpid(105);
		 trans.begin();
		 eManager.remove(emp);		//cannot be deleted because object is not attached with entity manager
		 eManager.merge(emp2);		//used to update record if data is there if not data gets added
		 trans.commit();
		 eManager.close();
		 emf.close();
	}
}
