package com.accu.assignment.oct292025.AccessModifiers;

public class Sample1 {
	String name = "Steve";
	int age = 110;
	protected String address = "Hyderabad";
	private String mobileNumber= "+91-9898787656";
	
	public void showName() {
		System.out.println("Name : "+name);
	}
	void showAge() {
		System.out.println("Age : "+age);
	}
	protected void showAddress() {
		System.out.println("Address : "+address);
		showMobileNumber();
	}
	private void showMobileNumber() {
		System.out.println("Mobile number : "+mobileNumber);
	}
}
