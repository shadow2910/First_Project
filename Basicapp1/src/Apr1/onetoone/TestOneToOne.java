package com.cg.mvm.jpa_demo.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Address add1=new Address(7001,"MG Street","Sec-bad","Telangana");
		Address add2=new Address(7002,"Anna Salai","Chennai","Tamilnadu");
		Person p1=new Person(1001,"Ajay Saxena",30,add1);
		Person p2=new Person(1002,"Babu Raja",25,add2);
		transaction.begin();
		manager.persist(add1);
		manager.persist(add2);
		manager.persist(p1);
		manager.persist(p2);
		transaction.commit(); 		//commit takes time if we fetch the value in the same code there are chances it will result to null because it has not yet been initialized
		Person p=manager.find(Person.class, 1001);
		if(p!=null) {
			System.out.println(p);		//we are fetching person but we also get address
			Address a=p.getAddress();	//one-to-one property(uni-directional relation)
			System.out.println(a);
		}
		Address a=manager.find(Address.class, 7002);
		if(a!=null) {
			System.out.println(a);		//we are fetching address but we can also navigate to person
			Person p3=a.getPerson();	//one-to-one property(bi-directional relation)
			System.out.println(p3);
		}
		manager.close();
		factory.close();
	}
}
