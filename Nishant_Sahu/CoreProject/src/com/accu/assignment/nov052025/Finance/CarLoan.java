package com.accu.assignment.nov052025.Finance;

public class CarLoan extends Loan {

	float rate = 8.6f;
	int tenure = 60;

	public CarLoan(String loanId, String customerName, double loanAmount) {
		super(loanId, customerName, loanAmount);
	}

	public void calculateEMI() {
		System.out.println("Your car loan EMI is Rs " + (((loanAmount + (loanAmount * rate * tenure) / 100)) / tenure)+" per month.");
	}

}
