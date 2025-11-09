package com.accu.assignment.nov052025.bankAccount;

public abstract class BankAccount {
	String accountNumber;
	String accountholder;
	double balance;
	
	public BankAccount(String accountNumber, String accountholder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountholder = accountholder;
		this.balance = balance;
	}

	public void showAccoutDetails() {
		System.out.println("Account holder name : "+accountholder);
		System.out.println("Account number name : "+accountNumber);
		System.out.println("Balance : "+balance);
	}
	
	public abstract void calculateInterest();

}
