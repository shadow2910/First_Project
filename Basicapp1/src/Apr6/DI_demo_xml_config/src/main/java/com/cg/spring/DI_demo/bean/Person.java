package com.cg.spring.DI_demo.bean;

public class Person {
	int ssn;
	String name;
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
