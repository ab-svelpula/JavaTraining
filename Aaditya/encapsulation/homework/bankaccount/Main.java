package com.aaditya.encapsulation.homework.bankaccount;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setBalance(1000);
		System.out.println("Account balance: "+account.getBalance());
	}
}
