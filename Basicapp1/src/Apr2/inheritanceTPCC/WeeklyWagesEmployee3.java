package com.cg.mvm.jpa_demo.inheritanceTPCC;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class WeeklyWagesEmployee3 extends Employee3 {
	
	@Column(name="rate_hour")
	double ratePerHour;
	@Column(name="hours_worked")
	int hoursWorked;
	public WeeklyWagesEmployee3() {
		super();
	}
	public WeeklyWagesEmployee3(int empid, String ename,double ratePerHour, int hoursWorked) {
		super(empid, ename);
		this.ratePerHour = ratePerHour;
		this.hoursWorked = hoursWorked;
	}
	public double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	@Override
	public String toString() {
		return "WeeklyWagesEmployee [ratePerHour=" + ratePerHour + ", hoursWorked=" + hoursWorked + "]";
	}
	

}
