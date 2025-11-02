package com.aaditya.inhpol.homework.bank;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Bank Account Class");
		BankAccount account =  new BankAccount();
		account.deposit();
		account.withdraw();
		
		
		CurrentAccount currAccount = new CurrentAccount();
		System.out.println("\nCurrent Account\n");
		System.out.println("Total account balance is: "+currAccount.balance);
		currAccount.withdraw();
		
		SavingsAccount savingsAccount = new SavingsAccount();
		System.out.println("\nSavings Account\n");
		System.out.println("Total account balance is: "+savingsAccount.balance);
		savingsAccount.withdraw();
	}
}
