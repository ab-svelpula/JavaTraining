package com.accu.assignment.oct292025.Encapsulation.BankRules;

public class BankAccount {
	void deposit() {
		System.out.println("Deposite successful.");
	}

	void withdraw() {
		System.out.println("Withdraw Successful.");
	}

	final void minimumBalance() {
		System.out.println("Must maintain minimum blance of Rs 500/-.");
	}

}