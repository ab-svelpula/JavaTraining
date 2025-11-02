package com.aaditya.inhpol.homework.bank;

//Create a BankAccount class with deposit() and withdraw() methods. 
//Inherit SavingsAccount and CurrentAccount classes and override withdraw() rules.
public class BankAccount {
	int balance = 1000;
	void deposit() {
		int depVal = 1000;
		System.out.println(depVal+" Rupees deposited");
		balance+=depVal;
		System.out.println("Total Account Balance is: "+balance);
	}
	
	void withdraw() {
		int withVal = 500;
		System.out.println(withVal+" Rupees withdrawn");
		balance-=withVal;
		System.out.println("Total Account Balance is: "+balance);
	}
}
