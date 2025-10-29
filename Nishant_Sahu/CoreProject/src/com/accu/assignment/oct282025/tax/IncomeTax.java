package com.accu.assignment.oct282025.tax;

public class IncomeTax extends Tax {
	int rate = 10;
	int income = 19000;
	void calculateTax() {
		double tax = income*rate/100;
		System.out.println("Payble tax : "+(tax+surcharge));
	}
}
