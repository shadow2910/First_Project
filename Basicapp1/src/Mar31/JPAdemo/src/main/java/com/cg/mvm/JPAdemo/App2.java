package com.cg.mvm.JPAdemo;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.cg.mvm.JPAdemo.entity.Employee;
public class App2 {
  public static void main(String[] args) {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	 EntityManager eManager=emf.createEntityManager();
	 Employee emp=new Employee(112,"Ankur",15000,LocalDate.now());
	 EntityTransaction trans=eManager.getTransaction();	//needed to perform DML operations on database	 
	 trans.begin();		//transaction begins
	 eManager.persist(emp);		//persist used to store the data permanently to database
	 							//add data to database
	 Employee emp2=eManager.find(Employee.class, 702);
	 if(emp2!=null)
		 eManager.remove(emp2);		//remove used to delete a record
	 else 
		 System.out.println("Employee with 102 id does not exist");
	 
	 Employee emp3=eManager.find(Employee.class, 705);
	 if(emp3!=null)
	 {
		 emp3.setEname("Chandu");		//updation of record
		 emp3.setSalary(3300);
	 }
	 trans.commit();			//commit the step which is done to prevent rollback
	 eManager.close();
	 emf.close();
	  
  }
}
