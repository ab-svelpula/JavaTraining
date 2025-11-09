package com.accu.assignment.nov052025.Finance;

public class PersonalLoan extends Loan {

	float rate = 11.99f;
	int tenure = 24;

	public PersonalLoan(String loanId, String customerName, double loanAmount) {
		super(loanId, customerName, loanAmount);
	}

	public void calculateEMI() {
		System.out.println("Your personal loan EMI is Rs " + (((loanAmount + (loanAmount * rate * tenure) / 100)) / tenure)+" per month.");
	}

}
