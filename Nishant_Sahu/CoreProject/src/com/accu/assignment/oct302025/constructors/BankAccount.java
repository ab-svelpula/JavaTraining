package com.accu.assignment.oct302025.constructors;

public class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void showAccountDetails() {
		System.out.println("Account number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
}
