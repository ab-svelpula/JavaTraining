package com.accu.assignment.oct292025.Encapsulation.BankAccount;

public class MainClass {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setBalance(9000);
		System.out.println("Amount deposited : "+ba.getBalance());
		ba.setBalance(ba.getBalance()-5000);
		System.out.println("balance amount after 5000 withdrawal: "+ba.getBalance());

	}

}
