package com.cg.spring.DI_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.Wisher;

public class App2 {
  public static void main(String[] args) {
    
	  ApplicationContext container=new ClassPathXmlApplicationContext("Beans.xml");
	  
	
  }
}

//ApplicationContext container goes for eager initialization in case of singleton objects
//It creates bean class object before it is refrenced and keeps it ready
//scope="prototype" is lazy initialization it creates object only when refrence.Try it.

//We can make  bean lazy by specifying it in configuration
//lazy-init="true"

