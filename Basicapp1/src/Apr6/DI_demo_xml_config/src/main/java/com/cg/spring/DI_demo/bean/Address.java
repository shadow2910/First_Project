package com.cg.spring.DI_demo.bean;

public class Address {
	
	String hno;
	String street;
	String City;
	String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String hno, String street, String city, String state) {
		super();
		this.hno = hno;
		this.street = street;
		City = city;
		this.state = state;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getstreet() {
		return street;
	}
	public void setstreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", City=" + City + ", state=" + state + "]";
	}
	
}
