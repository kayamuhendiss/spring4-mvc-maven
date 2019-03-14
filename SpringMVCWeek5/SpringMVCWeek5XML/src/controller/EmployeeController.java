package controller;


import java.util.Arrays;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Employee;
import model.EmployeeList;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@RequestMapping("/sample")
	@ResponseBody
	public Employee getEmployee() {
		return new Employee(1,"Zuleyha","KAYA",5000);
	}
	// XML formatinda List donmek istedigimizde ;
	// [org.springframework.http.converter.HttpMessageNotWritableException: No
	// converter found for return value of type: class java.util.Arrays$ArrayList]

//	@RequestMapping
//	@ResponseBody
//	public List<Employee> getAllEmployees() {
//		Employee employee1 = new Employee(1, "Zuleyha", "Kaya", 5000);
//		Employee employee2 = new Employee(2, "Emine", "Kaya", 15000);
//		Employee employee3 = new Employee(3, "Ayse", "Kaya", 15000);
//		return Arrays.asList(employee1, employee2, employee3);
//	}
	
	@RequestMapping
	@ResponseBody
	public EmployeeList getAllEmployees() {
		Employee employee1 = new Employee(1, "Zuleyha", "Kaya", 5000);
		Employee employee2 = new Employee(2, "Emine", "Kaya", 15000);
		Employee employee3 = new Employee(3, "Ayse", "Kaya", 15000);
		return new EmployeeList(Arrays.asList(employee1,employee2,employee3));
	}

}
