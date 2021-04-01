package com.cg.mvm.jpa_demo.onetoone;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;
@Entity
@Table(name="Person")
public class Person {
		@Id
		@Column(name="per_ssn")
		int ssn;
		@Column(name="name")
		String name;
		@Column(name="per_age")
		int age;
		@OneToOne				//used for one-to-one mapping
		@JoinColumn(name="add_id")
		Address address;
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Person(int ssn, String name, int age, Address address) {
			super();
			this.ssn = ssn;
			this.name = name;
			this.age = age;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Person [ssn=" + ssn + ", name=" + name + ", age=" + age + ", address=" + address + "]";
		}
		
		
}
