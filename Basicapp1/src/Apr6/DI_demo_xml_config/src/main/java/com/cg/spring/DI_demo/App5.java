package com.cg.spring.DI_demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cg.spring.DI_demo.bean.Wisher;

public class App5 {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("Beans.xml"));
		Wisher w=factory.getBean("wish1",Wisher.class);
		System.out.println(w.getMessage());
	}

}
