package com.accu.assignment.oct282025.bankAccount;

public class SavingsAccount extends BankAccount {

	void withdraw() {
		super.withdraw();
		System.out.println("Withdraw Successful from savings account.");
	}

}
