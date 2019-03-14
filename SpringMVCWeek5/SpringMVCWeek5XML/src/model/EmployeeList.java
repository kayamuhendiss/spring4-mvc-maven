package model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employeeList")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeList {
	

	@XmlElement(name = "employee-definition")
	private List<Employee> employeeList;

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public EmployeeList(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public EmployeeList() {
		super();
	}
	

}
