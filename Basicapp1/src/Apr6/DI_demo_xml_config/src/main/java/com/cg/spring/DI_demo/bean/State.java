package com.cg.spring.DI_demo.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class State {

	String stateName;
	Set<String> cities;
	List<String> towns;
	Map<String,String> capitals;
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public State(String stateName, Set<String> cities, List<String> towns, Map<String, String> capitals) {
		super();
		this.stateName = stateName;
		this.cities = cities;
		this.towns = towns;
		this.capitals = capitals;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Set<String> getCities() {
		return cities;
	}
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	
	public List<String> getTowns() {
		return towns;
	}
	public void setTowns(List<String> towns) {
		this.towns = towns;
	}
	
	public Map<String, String> getCapitals() {
		return capitals;
	}
	public void setCapitals(Map<String, String> capitals) {
		this.capitals = capitals;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", cities=" + cities + ", towns=" + towns + ", capitals=" + capitals
				+ "]";
	}
	
	
}
