package com.accu.assignment.nov052025.bankAccount;

public class LoanAccount extends BankAccount {

	public LoanAccount(String accountNumber, String accountholder, double balance) {
		super(accountNumber, accountholder, balance);
		// TODO Auto-generated constructor stub
	}

	float rate = 11.99f;

	@Override
	public void calculateInterest() {
		System.out.println("Balance after interest : " + (balance + (balance * rate / 100)));

	}

}
