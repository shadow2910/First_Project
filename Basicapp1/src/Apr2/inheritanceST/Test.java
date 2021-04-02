package com.cg.mvm.jpa_demo.inheritanceST;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		SalariedEmployee1 sm=new SalariedEmployee1(101,"Ajay",1000);
		WeeklyWagesEmployee1 wwe=new WeeklyWagesEmployee1(102,"Babu",25,30);
		EntityTransaction trans=manager.getTransaction();
		trans.begin();
		manager.persist(sm);
		manager.persist(wwe);
		trans.commit();
		manager.close();
		factory.close();
	}
}
