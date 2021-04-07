package com.cg.boot.spbt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Component-we use it's synonym here @Controller
@Controller
@ResponseBody		//whatever response is generated that is sent back to client
public class DemoController {
	//@RequestMapping(value="/wish",method=RequestMethod.GET)			//indicate this method is request mapping method
	@GetMapping(value="/wish")		//instead of @RequestMapping we can use this
	public String sayHello() {		//one method can only have one response mapping
		return "Hello World";		//message which is returned and sent to client
	}
	
	
	//@RequestMapping(value="/weatherReport",method=RequestMethod.GET)
	@GetMapping(value="/weatherReport")	
	public String getWeatherReport() {
		return "Sunny.38 Degree Celsius";
	}
}


/*		Request
when user gives-http://localhost:8080/wish
it is mapped to this mapping method.
@RestController=@Controller+@ResponseBody
*/