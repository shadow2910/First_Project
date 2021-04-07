package com.cg.spring.DI_demo;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.State;

public class App8 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("Beans4.xml");
		State s=container.getBean("state1",State.class);
		System.out.println(s);
		for(Entry<String,String> c:s.getCapitals().entrySet())
			System.out.println(c.getKey()+" "+c.getValue());
		container.close();
	}

}
