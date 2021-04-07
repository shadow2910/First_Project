package com.cg.spring.DI_demo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cg.spring.DI_demo.bean.Wisher;

public class App4 {
	
	public static void main(String[] args) {
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		//(striked off characters means it's depreciated)
		Wisher w=factory.getBean("wish1",Wisher.class);
		System.out.println(w.getMessage());
	}

}
//post process doesn't work for XmlBeanFactory
//destroy() not called because no .close() method
//It is not recommended to use XmlBeanFactory
//We use DefaultListableBeanFactory instead.