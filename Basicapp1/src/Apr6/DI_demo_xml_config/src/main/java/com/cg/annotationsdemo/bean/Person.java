package com.cg.annotationsdemo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Person {
	int ssn=7001;
	String name="Ajay Saxena";
	@Autowired
	//@Qualifier("add2")
	Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int ssn, String name, Address address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", address=" + address + "]";
	}
	
}
//@Autowired can be placed on property/constructor(constructor injection)/setterMethod(setter injection).
//@Qualifier doesn't work with constructor.
//It indicates which bean is qualified to be used in case of ambiguity(more than one beans in configuration file)
