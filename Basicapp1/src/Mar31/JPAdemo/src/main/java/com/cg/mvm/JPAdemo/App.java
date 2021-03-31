package com.cg.mvm.JPAdemo;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.cg.mvm.JPAdemo.entity.Employee;
public class App {
  public static void main(String[] args) {
	  //EntityManagerFactory is an interface used to create EntityManagerObject
	  //EntityManager object is used to perform operation on database without writing sql query
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	  //															(in persistence xml file)
      EntityManager eManager=emf.createEntityManager();
	  Employee e=eManager.find(Employee.class, 105);	//find used to fetch single record
	  //								(primary key)
	  //JPA finds the record from database stores it in resultset and then converts it to object
	  //that's the advantage compared to normal JDBC
	  if(e!=null)
		  System.out.println(e);
	  else
		  System.out.println("Employee record does not exist");
	  eManager.close();
	  emf.close();
	  
  }
}
