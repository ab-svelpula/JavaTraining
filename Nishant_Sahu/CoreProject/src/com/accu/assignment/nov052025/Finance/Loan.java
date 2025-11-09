package com.accu.assignment.nov052025.Finance;

public abstract class Loan {
	String loanId;
	String customerName;
	double loanAmount;

	public Loan(String loanId, String customerName, double loanAmount) {
		super();
		this.loanId = loanId;
		this.customerName = customerName;
		this.loanAmount = loanAmount;
	}

	public void showDetails() {
		System.out.println("Loan Id : "+loanId);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Loan amount : "+loanAmount);
	}
	
	public abstract void calculateEMI();
	
	
}
