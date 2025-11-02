package com.aaditya.inhpol.homework.account;

public class Main {
	public static void main(String[] args) {
		Account account = new Account();
		account.showBalance();
		
		FixedDeposit deposit = new FixedDeposit();
		deposit.showBalance();
		
		RecurringDeposit recDep = new RecurringDeposit();
		recDep.showBalance();
	}
}
