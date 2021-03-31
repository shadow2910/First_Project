package com.cg.mvm.jpa_demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {

	private static EntityManagerFactory emFactory=null;
	private static EntityManager eManager=null;
	static {
		emFactory=Persistence.createEntityManagerFactory("JPA-PU");
		
	}
	
	public static EntityManager getEntityManager() {
		if(eManager==null || eManager.isOpen())
			eManager=emFactory.createEntityManager();
		return eManager;
	}
}
