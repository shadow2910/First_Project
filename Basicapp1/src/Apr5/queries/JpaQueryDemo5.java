package com.cg.mvm.jpa_demo.queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JpaQueryDemo5 {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Department> tq1=manager.createNamedQuery("getDepartmentByDeptno",Department.class);
		tq1.setParameter("dno1", 40);
		tq1.setParameter("dno2", 40);
		List<Department> dlist=tq1.getResultList();
		for(Department d:dlist)
			System.out.println(d);
		TypedQuery<Department> tq2=manager.createNamedQuery("getDepartmentByLocation",Department.class);
		tq2.setParameter("loc", "Mumbai");
		List<Department> dlist2=tq2.getResultList();
		for(Department d:dlist2)
			System.out.println(d);
		manager.close();
		factory.close();
	}
}
