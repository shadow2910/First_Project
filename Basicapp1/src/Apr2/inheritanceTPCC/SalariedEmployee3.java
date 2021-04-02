package com.cg.mvm.jpa_demo.inheritanceTPCC;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class SalariedEmployee3 extends Employee3{
	@Column(name="salary")
	double salary;

	public SalariedEmployee3() {
		super();
	}
	public SalariedEmployee3(int empid,String ename,double salary) {
		super(empid,ename);
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]";
	}
	

}
