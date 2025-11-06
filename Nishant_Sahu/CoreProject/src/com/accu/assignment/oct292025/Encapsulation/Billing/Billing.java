package com.accu.assignment.oct292025.Encapsulation.Billing;

public class Billing {
	final float GST_RATE = 18;

	public void calculateBill(double amount) {
		double finalPrice = amount+(amount*GST_RATE/100);
		System.out.println("Final price including GST: Rs "+finalPrice);
	}
	
}
