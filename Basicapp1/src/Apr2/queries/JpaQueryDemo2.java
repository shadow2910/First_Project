package com.cg.mvm.jpa_demo.queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JpaQueryDemo2 {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Department> qry=manager.createQuery("select d from Department d where d.deptno=10",Department.class);
		
		List<Department> list=qry.getResultList();
		for(Department d:list)
			System.out.println(d);
		manager.close();
		factory.close();
			
	}
}


