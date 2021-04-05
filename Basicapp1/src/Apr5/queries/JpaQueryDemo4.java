package com.cg.mvm.jpa_demo.queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JpaQueryDemo4 {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Department> qry=manager.createQuery("select d from Department d where d.deptno=? or d.deptno=?",Department.class);
		//TypedQuery<Department> qry=manager.createQuery("select d from Department d where d.deptno=:dno1",Department.class);
		//qry.setParameter("dno1",10);
		qry.setParameter(0, 10);
		qry.setParameter(1, 40);
		List<Department> dlist=qry.getResultList();
		for(Department d:dlist)
			System.out.println(d);
		manager.close();
		factory.close();
	}
}
//We can use setPatameter to pass value to queries later(runtime)