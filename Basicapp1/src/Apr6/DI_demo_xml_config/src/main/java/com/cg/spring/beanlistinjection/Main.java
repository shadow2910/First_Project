package com.cg.spring.beanlistinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.beanlistinjection.bean.SBU;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("beanslistinjection_beans.xml");
		SBU sbu=container.getBean("sbu1",SBU.class);
		System.out.println(sbu);
		container.close();
	}
}
