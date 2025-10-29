package com.accu.assignment.oct282025.investment;

public class MutualFundInvestment extends Investment {
	int growthRate = 12;

	void calculateReturns() {
		double returns = investmentAmount * (Math.pow((1 + growthRate / 100), investmentDuration));
		System.out.println("Total returns : Rs "+returns);
	}
}
