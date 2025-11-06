package com.accu.assignment.oct292025.Encapsulation.Employee;

public class Employee {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary, String role) {
		if (role.equals("HR"))
			this.salary = salary;
		else
			System.out.println("You dont have access to update salary.");
	}

}
