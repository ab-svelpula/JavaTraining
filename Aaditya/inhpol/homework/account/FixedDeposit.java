package com.aaditya.inhpol.homework.account;

public class FixedDeposit extends Account{
	int fdInterest=7;
	void showBalance() {
		System.out.println("\nFixed Deposit");
		System.out.println("Overridden balance: ");
		super.showBalance();
		
		System.out.println("\nFixed Deposit Balance");
		int interest = calcInterest(balance, time, fdInterest);
		int total = balance+interest;
		System.out.println("Fixed deposit interest is: "+total);
	}
}
