package com.aaditya.inhpol.homework.loan;

public class HomeLoan extends Loan {
	
	void calculateEMI() {
		System.out.println("Overridden EMI Calculation:");
		super.calculateEMI();
		this.rate = 10;
		interest = calculateInterest(amount, time, rate);
		total = calculateTotalAmount(interest);
		System.out.println("The interest amount is: "+interest);
		System.out.println("The total amount is: "+total);
		int months = time*12;
		int emi = total/months;
		System.out.println("The monthly emi value for the home loan is: "+emi);
		
		
		
	}
}
