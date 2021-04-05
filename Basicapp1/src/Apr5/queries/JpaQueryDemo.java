package com.cg.mvm.jpa_demo.queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaQueryDemo {

	public static void main(String[] args) {
		//we need entity manager to work with JPQL
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		Query qry=manager.createQuery("select d from Department d where d.deptno=10");
	//	import Query from javax.persistence only	(class name)	  (class datamember)
		List<Department> list=qry.getResultList();
		for(Department d:list)
			System.out.println(d);
		manager.close();
		factory.close();
			
	}
}
//if we change List<Department> to List<Employee>
//this will create a type mismatch problem as department object can't be mapped with employee object
//To avoid this kind of error we use TypedQuery<Department>

