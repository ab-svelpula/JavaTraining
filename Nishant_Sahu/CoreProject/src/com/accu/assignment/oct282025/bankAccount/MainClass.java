package com.accu.assignment.oct282025.bankAccount;

public class MainClass {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		sa.deposit();
		sa.withdraw();
		ca.deposit();
		ca.withdraw();
	}

}
