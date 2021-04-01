package com.cg.mvm.jpa_demo.onetomany_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		Department d=manager.find(Department.class, 20);
		if(d!=null)
		{
			System.out.println(d);
			for(Employee e:d.getEmployees())		//many employees can be navigated from one
				System.out.println(e);				//one-to-many relation
		}
		else
			System.out.println("Department not found");
		manager.close();
		factory.close();
	}
}
//show_sql in persistence adds queries generated to console window

//if we don't access employee list from department.Hibernate doesn't generate sql query for employee list
//This is called lazy fetching
//By default fetch type is lazy
//To make fetching as eager
//@OneToMany(fetch=FetchType.EAGER)
//This generates the query even if we are not accessing, fetches the data and keeps it ready