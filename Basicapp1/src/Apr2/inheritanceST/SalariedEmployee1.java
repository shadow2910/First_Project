package com.cg.mvm.jpa_demo.inheritanceST;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("Salaried")			//value to be put in discriminator column when this object is created
@Entity
public class SalariedEmployee1 extends Employee1{
	@Column(name="salary")
	double salary;

	public SalariedEmployee1() {
		super();
	}
	public SalariedEmployee1(int empid,String ename,double salary) {
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
