package com.cg.mvm.jpa_demo.onetomany_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		Department d=manager.find(Department.class, 30);
		if(d!=null) {
			System.out.println(d);
			for(Employee e:d.getEmployees())
				System.out.println(e);
			
		}
		System.out.println("-----xxxxxx--------");
		Employee e1=manager.find(Employee.class, 117);
		if(e1!=null)
		{
			System.out.println(e1);
			Department d1=e1.getDepartment();
			System.out.println(d1);
		}
		manager.close();
		factory.close();
	}

}
