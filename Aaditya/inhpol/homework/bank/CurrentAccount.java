package com.aaditya.inhpol.homework.bank;

public class CurrentAccount extends BankAccount {
	void withdraw() {
		super.withdraw();
		int withVal = 200;
		System.out.println(withVal+" Rupees withdrawn from Current Account");
		balance-=withVal;
		System.out.println("Total balance is: "+balance);
	}
}
