package com.accu.assignment.oct292025.Encapsulation.BankRules;

public class MainClass {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		sa.deposit();
		sa.withdraw();
		sa.minimumBalance();
		ca.deposit();
		ca.withdraw();
		ca.minimumBalance();
	}

}
