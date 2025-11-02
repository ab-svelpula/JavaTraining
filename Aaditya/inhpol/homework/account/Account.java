package com.aaditya.inhpol.homework.account;

public class Account {
	int balance = 50000;
	void showBalance() {
		System.out.println("The Account balance is: "+balance);
	}
	int time = 5;
	
	int calcInterest(int p, int t, int r) {
		int i = p*t*r/100;
		return i;
	}
}
