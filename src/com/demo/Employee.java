package com.demo;

public class Employee {
	private String name;
	private double sal;
	private String department;

	

	public Employee(String name, double sal, String department) {
		super();
		this.name = name;
		this.sal = sal;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", department=" + department + "]";
	}

	
	
}
