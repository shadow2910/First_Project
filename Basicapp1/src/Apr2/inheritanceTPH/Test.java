package com.cg.mvm.jpa_demo.inheritanceTPH;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.cg.mvm.jpa_demo.inheritanceTPH.*;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		SalariedEmployee2 sm=new SalariedEmployee2(101,"Ajay",1000);
		WeeklyWagesEmployee2 wwe=new WeeklyWagesEmployee2(102,"Babu",25,30);
		EntityTransaction trans=manager.getTransaction();
		trans.begin();
		manager.persist(sm);
		manager.persist(wwe);
		trans.commit();
		manager.close();
		factory.close();
	}
}
//program might give error because same names used in previous packages