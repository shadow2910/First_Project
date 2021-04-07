package com.cg.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.annotationsdemo.bean.Person;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("annotationsdemo_beans.xml");
		Person p1=container.getBean("per1",Person.class);
		System.out.println(p1);
		container.close();
	}
}
