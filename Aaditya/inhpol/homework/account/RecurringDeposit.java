package com.aaditya.inhpol.homework.account;

public class RecurringDeposit extends Account{
	int recInterest=5;
	void showBalance() {
		System.out.println("\nRecurring Deposit");
		System.out.println("\nOverridden balance: ");
		super.showBalance();
		
		System.out.println("\nRecurring Deposit Balance");
		int interest = calcInterest(balance, time, recInterest);
		int total = balance+interest;
		System.out.println("Fixed deposit interest is: "+total);
	}
}
