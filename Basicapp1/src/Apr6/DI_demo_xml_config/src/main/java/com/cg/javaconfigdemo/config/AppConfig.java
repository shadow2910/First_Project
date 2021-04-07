//This class is equivalent to xml configuration file
package com.cg.javaconfigdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.javaconfigdemo.bean.Address;
import com.cg.javaconfigdemo.bean.Person;

@Configuration		//indicates configuration is done using this class
@ComponentScan(basePackages="com.cg.javaconfigdemo.bean")
public class AppConfig {
	@Bean		//indicates Bean definition
	public Address address() {
		return new Address("4-5-6","Abc Xyz","Bangalore","Karnataka");
	}
	
	@Bean
	public Person person() {
		return new Person(786,"Dinesh",address());
	}
	
}
//If we write @Component @autowired statements in entity class 
//then we can skip this @Bean definitions.