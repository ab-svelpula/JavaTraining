package com.aaditya.inhpol.homework.loan;

public class Loan {
	int amount = 10000;
	int rate = 2; 
	int time = 5;
	//logic is to calculate the total value of the loan with interest and then divide by the total number of months for the monthly emi amount.
	int interest = calculateInterest(amount,time,rate);
	int total = calculateTotalAmount(interest);
	
	int calculateInterest(int a, int t, int r) {
		int i = amount*time*rate/100;
		return i;
	}
	int calculateTotalAmount(int i) {
		int tot = interest+amount;
		return tot;
	}
	void calculateEMI() {
		int months = time*12;
		int emi = total/months;
		System.out.println("The monthly emi value is: "+emi);
	}
}
