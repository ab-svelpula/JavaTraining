package com.accu.assignment.oct282025.loan;

public class CarLoan extends Loan {
	void calculateEMI() {
		super.calculateEMI();
		System.out.println("Calculated Car loan EMI with 10% interest.");
	}
}
