package com.cg.spring.DI_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.Person;

public class App7 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("Beans3.xml");
		Person p=container.getBean("per1",Person.class);
		System.out.println(p);
		container.close();
	}
}
