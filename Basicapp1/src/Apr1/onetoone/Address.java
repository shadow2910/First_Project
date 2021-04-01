package com.cg.mvm.jpa_demo.onetoone;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Column;
@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@Column(name="add_id")
	int addressId;
	@Column(name="add_street")
	String streetName;
	@Column(name="add_city")
	String city;
	@Column(name="add_state")
	String state;
	@OneToOne(mappedBy="address")		//bi-directional relation
	Person person;						//now we can access person from address 
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String streetName, String city, String state) {
		super();
		this.addressId = addressId;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ "]";
	}
	

}
