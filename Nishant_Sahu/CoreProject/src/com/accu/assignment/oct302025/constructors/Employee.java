package com.accu.assignment.oct302025.constructors;

public class Employee {
	private String name;
	private String role;
	private String department;
	private double salary;

	public Employee() {
		System.out.println("Welcome to Employee class");
	}

	public Employee(String name, String role, String department, double salary) {
		super();
		this.name = name;
		this.role = role;
		this.department = department;
		this.salary = salary;
	}

	public void showEmployeeDetails() {
		System.out.println("Employees's name : " + name);
		System.out.println("Employees's role : " + role);
		System.out.println("Employees's department : " + department);
		System.out.println("Employees's salary : " + salary);
	}

}
