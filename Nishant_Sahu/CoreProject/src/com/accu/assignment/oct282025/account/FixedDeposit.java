package com.accu.assignment.oct282025.account;

public class FixedDeposit extends Account {
  void showBalance() {
	  super.showBalance();
	  System.out.println("Showing available balance with fixed interest.");
  }
}
