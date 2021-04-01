package com.cg.mvm.jpa_demo.onetomany_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main2 {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction trans=manager.getTransaction();
		Department d=manager.find(Department.class, 20);
		trans.begin();
		if(d!=null) {
			manager.remove(d);		//deleting the department also delete all records which has a reference to it. Since it's cascaded
		}
		trans.commit();
		manager.close();
		factory.close();
	}
}
//primary key cannot be modified