package com.accu.assignment.oct292025.Encapsulation.Employee;

public class MainClass {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setSalary(8000, "REC");
		System.out.println("Employee Salary is : "+employee.getSalary());

	}

}
