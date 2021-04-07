//How spring framework creates an object and returns it
package com.cg.spring.DI_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.Wisher;

public class App {
  public static void main(String[] args) {
    
	  ApplicationContext container=new ClassPathXmlApplicationContext("Beans.xml");
//		(interface)						(implements class path xml)
	  Wisher w=(Wisher)container.getBean("wish1");
	  //								(id of bean)
	  //used to get the bean object		
	  System.out.println(w.getMessage());
	  //-----------xxxxxxxxx------------
	  Wisher w1=container.getBean("wish1",Wisher.class);
	  System.out.println(w1.getMessage());
	  w1.setMessage("Changes made to w1 are also reflected in w in case of singleton scope");
	  System.out.println(w.getMessage());
	  System.out.println(w1.getMessage());
	  
	  
	
  }
}
//We are not creating object like new Wisher()
//Spring framework creates that object for us

/*
 * Different Application context which can be used
-ClassPathXmlApplicationContext
-FileSystemXmlApplicarionContext
-AnnotationConfigApplicationContext
*/

//In this case our xml file is in class path so we use 1st one
//2nd one we can use when we store our xml file at some location and provide path to it
	//new FileSystemXmlApplicationContext("C:\....");

