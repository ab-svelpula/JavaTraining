package com.accu.assignment.oct282025.account;

public class RecurringDeposit extends Account {
  void showBalance() {
	  super.showBalance();
	  System.out.println("Showing available balance with recurring interest.");
  }
}
