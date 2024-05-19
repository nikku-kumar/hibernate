package com.tap;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	
	@Id
	@Column(name ="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="email")
	private String email;
	
	@Column(name="department")
	private String department;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary, String email,String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.department= department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", department="
				+ department ;
	}
	
	
	

}
