package com.accu.assignment.oct292025.Encapsulation.Customer;

public class MainClass {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setEmailId("nishaint.sahu@gmail.in");
		c.setMobileNumber("8878767657");
		System.out.println("Email Id: "+c.getEmailId());
		System.out.println("Mobile number: "+c.getMobileNumber());

	}

}
