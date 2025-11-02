package com.aaditya.inhpol.homework.loan;

public class CarLoan extends Loan{
	void calculateEMI() {
		System.out.println("Overriden EMI Calculation: ");
		super.calculateEMI();
		
		this.rate = 20;
		interest = calculateInterest(amount, time, rate);
		total = calculateTotalAmount(interest);
		System.out.println("The interest amount is: "+interest);
		System.out.println("The total amount is: "+total);
		int months = time*12;
		int emi = total/months;
		System.out.println("The monthly emi value for car loan is: "+emi);
	}
}
