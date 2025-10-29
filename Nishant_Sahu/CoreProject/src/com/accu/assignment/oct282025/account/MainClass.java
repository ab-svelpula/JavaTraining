package com.accu.assignment.oct282025.account;

public class MainClass {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit();
		RecurringDeposit rd = new RecurringDeposit();
		fd.showBalance();
		rd.showBalance();
	}

}
