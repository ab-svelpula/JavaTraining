package com.accu.assignment.oct302025.constructors;

public class MainClass {
	public static void main(String[] args) {
		new Student();
		Student s = new Student("Steave Roggers", 16, 444);
		s.showStudentDetails();
		
		new Employee();
		Employee employee = new Employee("Bruce Banner", "", "", 0);
		employee.showEmployeeDetails();
		
		Product product =  new Product("Washing Machine",15000.50);
		product.showProductDetails();
		
		Car car =  new Car("Safari","Tata motors",3200000);
		car.showCarDetails();
		
		BankAccount bankAccount = new BankAccount("IK8229918WE12", 1876690.56);
		bankAccount.showAccountDetails();
		
		new Book(4);
	}
}
