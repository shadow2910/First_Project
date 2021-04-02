package com.cg.mvm.jpa_demo.inheritanceST;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("Wages")
@Entity
public class WeeklyWagesEmployee1 extends Employee1 {
	
	@Column(name="rate_hour")
	double ratePerHour;
	@Column(name="hours_worked")
	int hoursWorked;
	public WeeklyWagesEmployee1() {
		super();
	}
	public WeeklyWagesEmployee1(int empid, String ename,double ratePerHour, int hoursWorked) {
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
