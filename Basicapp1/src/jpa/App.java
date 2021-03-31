package com.cg.mvm.JPAdemo;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.cg.mvm.JPAdemo.entity.Employee;
public class App {
  public static void main(String[] args) {
	  
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	  EntityManager eManager=emf.createEntityManager();
	  Employee e=eManager.find(Employee.class, 105);
	  if(e!=null)
		  System.out.println(e);
	  eManager.close();
	  emf.close();
	  
  }
}
