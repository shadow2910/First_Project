package com.cg.spring.DI_demo.pp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("from ppbi()");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("from ppai()");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
//both are init() methods
//one is pre-init() other is post-init()
//pre-init() happens before object creation start so it is the first method that is called
//post-init() after object creation at last

//this postprocess methods are common to all the bean class in this application
