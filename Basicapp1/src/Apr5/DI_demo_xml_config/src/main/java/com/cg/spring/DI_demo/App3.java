package com.cg.spring.DI_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.Wisher;

public class App3 {
  public static void main(String[] args) {
    
	  ApplicationContext container=new ClassPathXmlApplicationContext("Beans.xml");
	  Wisher w=container.getBean("wish1",Wisher.class);
	  ((ClassPathXmlApplicationContext) container).close();
 }
}

//init method is called when object is created
//destroy method is called when object is destroyed in case of singleton
//this can be initialized by specifying it in <bean> in xml configuration file
//	init-method="init"  destroy-method="destroy"
//				(method name)			(method name from bean class)
//we can inherit these init() and destroy() methods and then override them in bean class.These have more priority
