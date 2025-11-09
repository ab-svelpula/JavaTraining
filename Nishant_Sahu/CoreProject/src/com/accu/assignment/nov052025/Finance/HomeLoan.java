package com.accu.assignment.nov052025.Finance;

public class HomeLoan extends Loan {

	float rate = 8;
	int tenure = 360;

	public HomeLoan(String loanId, String customerName, double loanAmount) {
		super(loanId, customerName, loanAmount);
	}

	public void calculateEMI() {
		System.out.println("Your home loan EMI is Rs " + (((loanAmount + (loanAmount * rate * tenure) / 100)) / tenure)+" per month.");
	}

}
