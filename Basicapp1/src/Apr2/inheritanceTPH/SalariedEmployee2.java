package com.cg.mvm.jpa_demo.inheritanceTPH;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="salariedemployee")
public class SalariedEmployee2 extends Employee2{
	@Column(name="salary")
	double salary;

	public SalariedEmployee2() {
		super();
	}
	public SalariedEmployee2(int empid,String ename,double salary) {
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
