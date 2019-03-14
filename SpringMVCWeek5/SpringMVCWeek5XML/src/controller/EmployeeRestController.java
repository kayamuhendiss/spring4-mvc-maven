package controller;


import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import model.Employee;

@Controller
@RequestMapping("/rest/employees")
public class EmployeeRestController {
	
	@RequestMapping("/sample")
	public Employee getEmployee() {
		return new Employee(1,"Zuleyha","KAYA",5000);
	}
	@RequestMapping
	    public List<Employee> getAllEmployees(){
		Employee employee1= new Employee(1,"Zuleyha","KAYA",5000);
		Employee employee2= new Employee(2,"Emine","KAYA",10000);
        Employee employee3= new Employee(3,"Aysee","KAYA",15000);
        
        return Arrays.asList(employee1,employee2,employee3);

		
	}

}
