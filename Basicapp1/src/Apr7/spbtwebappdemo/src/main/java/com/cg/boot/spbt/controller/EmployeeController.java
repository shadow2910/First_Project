package com.cg.boot.spbt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.boot.spbt.entity.Employee;
@RestController
public class EmployeeController {
	ArrayList<Employee> elist=new ArrayList<>();
	public EmployeeController() {
		elist.add(new Employee(102,"Babu",2000));
		elist.add(new Employee(103,"Chandu",3000));
		elist.add(new Employee(101,"Ajay",1000));
		elist.add(new Employee(104,"Dinesh",4000));
	}
	
	@GetMapping(value="/{empid}" ,produces="application/json")		//String format to produce output in json format
	public Employee getEmployee(@PathVariable("empid") int empid) {
		for(Employee e:elist)
			if(e.getEmpid()==empid)
				return e;
		return null;
	}
	
	@GetMapping(value="/all",produces = MediaType.APPLICATION_JSON_VALUE)		//Enum format to produce output in json format
	public List<Employee> getEmployees(){
		return elist;
	}
}
/*To access first method
 * http://localhost:8086/102
 * 
 * To access second method
 * http://localhost:8086/all
 */
