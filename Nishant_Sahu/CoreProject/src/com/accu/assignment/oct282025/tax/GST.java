package com.accu.assignment.oct282025.tax;

public class GST extends Tax {
	int rate = 18;
	int price = 19000;
	void calculateTax() {
		double tax = price*rate/100;
		System.out.println("Payble tax : "+(tax+surcharge));
	}
}
