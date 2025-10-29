package com.accu.assignment.oct282025.investment;

public class Investment {
	int investmentDuration = 20;
	int investmentAmount = 90000;
	int growthRate = 6;

	void calculateReturns() {
		double returns = investmentAmount * (Math.pow((1 + growthRate / 100), investmentDuration));
		System.out.println("Total returns : Rs "+returns);
	}
}
