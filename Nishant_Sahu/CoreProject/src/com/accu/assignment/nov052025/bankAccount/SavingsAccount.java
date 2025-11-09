package com.accu.assignment.nov052025.bankAccount;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountNumber, String accountholder, double balance) {
		super(accountNumber, accountholder, balance);
		// TODO Auto-generated constructor stub
	}

	float rate = 3.4f;

	@Override
	public void calculateInterest() {
		System.out.println("Balance after interest : " + (balance + (balance * rate / 100)));

	}

}
