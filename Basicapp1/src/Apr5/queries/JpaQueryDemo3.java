package com.cg.mvm.jpa_demo.queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JpaQueryDemo3 {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		tran.begin();
		Query qry=manager.createQuery("delete from Department d where d.deptno=30");
		int count=qry.executeUpdate();
		System.out.println(count+"Rows deleted");
		tran.commit();
		manager.close();
		factory.close();
			
	}
}

//Typed query can only be used with select statements
//For DML operations we need to use Query
