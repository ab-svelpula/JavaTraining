package com.accu.assignment.oct282025.loan;

public class HomeLoan extends Loan {
	void calculateEMI() {
		super.calculateEMI();
		System.out.println("Calculated Home loan EMI with 8% interest.");
	}
}
