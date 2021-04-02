package com.cg.mvm.jpa_demo.inheritanceTPCC;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		SalariedEmployee3 sm=new SalariedEmployee3(101,"Ajay",1000);
		WeeklyWagesEmployee3 wwe=new WeeklyWagesEmployee3(102,"Babu",25,30);
		EntityTransaction trans=manager.getTransaction();
		trans.begin();
		manager.persist(sm);
		manager.persist(wwe);
		trans.commit();
		manager.close();
		factory.close();
	}

}
