package com.accu.assignment.nov052025.bankAccount;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(String accountNumber, String accountholder, double balance) {
		super(accountNumber, accountholder, balance);
		// TODO Auto-generated constructor stub
	}

	float rate = 0f;

	@Override
	public void calculateInterest() {
		System.out.println("Balance after interest : " + (balance + (balance * rate / 100)));

	}

}
