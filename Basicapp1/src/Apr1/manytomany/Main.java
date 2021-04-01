package com.cg.mvm.jpa_demo.manytomany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		/*Course c1=new Course(7001,"Java",4,4500);
		Course c2=new Course(7002,"DotNet",3,3000);
		Course c3=new Course(7003,"Python",2,4000);
		Course c4=new Course(7004,"C++",2,3000);
		Student s1=new Student(1001,"Ajay",9988776655L,"Hyderabad",Arrays.asList(c1,c3));
		Student s2=new Student(1002,"John Paul",2233445566L,"Bangalore",Arrays.asList(c2,c1,c4));
		Student s3=new Student(1003,"Chandu",3344556677L,"Mumbai",Arrays.asList(c2));
		Student s4=new Student(1004,"Dinesh",1234567890L,"Delhi",Arrays.asList(c4,c3));
		EntityTransaction trans=manager.getTransaction();
		trans.begin();
		manager.persist(c1);
		manager.persist(c2);
		manager.persist(c3);
		manager.persist(c4);
		manager.persist(s1);
		manager.persist(s2);
		manager.persist(s3);
		manager.persist(s4);
		trans.commit();*/
		
		//above course is for insertion of data into tables
		
		Student s=manager.find(Student.class, 1002);
		if(s!=null) {
			System.out.println(s);
			for(Course c:s.getCourses())		//1 student to many courses
				System.out.println(c);
		}
		System.out.println("-------xxxxxxx--------");
		Course c1=manager.find(Course.class, 7003);
		if(c1!=null) {
			System.out.println(c1);
			for(Student s1:c1.getStudents())
				System.out.println(s1);
		}
		
		manager.close();
		factory.close();
		
	}
}
