package com.aaditya.inhpol.homework.bank;

public class SavingsAccount extends BankAccount {
	void withdraw() {
		super.withdraw();
		int withVal = 300;
		System.out.println(withVal+" rupees withdrawn from Savings Account");
		balance-= withVal;
		System.out.println("Total balance is: "+balance);
	}
}
