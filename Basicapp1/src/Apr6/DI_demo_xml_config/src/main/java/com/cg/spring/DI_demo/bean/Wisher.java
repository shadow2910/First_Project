package com.cg.spring.DI_demo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Wisher implements InitializingBean,DisposableBean{
					//use these implementations to inherit init() and destroy() methods
	private String message;

	public Wisher() {
		super();
		System.out.println("Constructor");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destoy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}
	
	//These two methods are prioritized above user defined init() and destroy() methods

	public void wishInit() {
		//call it when object is created
		System.out.println("From init()");
	}
	
	public void wishDestroy() {
		//will be invoked only for singleton objects
		//call it when object is destroyed
		System.out.println("from destroy()");
	}
	
	
	
}
//bean class(simple POJO)
//To configure this as Spring Bean class we need to add XML file to classpath