package com.accu.assignment.oct292025.Encapsulation.BankRules;

public class CurrentAccount extends BankAccount {

	void withdraw() {
		super.withdraw();
		System.out.println("Withdraw Successful from currect account.");
	}
}
