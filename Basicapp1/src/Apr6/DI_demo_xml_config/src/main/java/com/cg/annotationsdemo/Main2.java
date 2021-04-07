package com.cg.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.annotationsdemo.bean.Person;

public class Main2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("annotationsdemo_bean.xml");
		Person p1=container.getBean(Person.class);
		System.out.println(p1);
		container.close();
	}
}
/* We can omit bean definition but we need to specify default values in class itself.
	
	Also we need to add annotation(@Component to both the dependent and dependency class.
	So that spring can understand which classes are to be considered for dependency and dependent out of many classes which may be present in project.
	
	And add context:component-scan base-package="path" in configuration file.
	So that spring can know which path to look for,while searching for components(dependency and dependent).

*/