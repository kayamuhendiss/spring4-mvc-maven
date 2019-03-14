package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	
	@XmlElement(name="emp_id")
	private int Id;
	
	@XmlElement(name="emp_name")
	private String name;
	private String surname;
	private int salary;
	
	
	public Employee() {
		super();
	}
	
	
	public Employee(int id, String name, String surname, int salary) {
		super();
		Id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}
