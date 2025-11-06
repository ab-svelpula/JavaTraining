package com.accu.assignment.oct292025.Encapsulation.BankRules;

public class SavingsAccount extends BankAccount {

	void withdraw() {
		super.withdraw();
		System.out.println("Withdraw Successful from savings account.");
	}

}
