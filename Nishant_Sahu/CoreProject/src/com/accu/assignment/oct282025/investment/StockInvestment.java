package com.accu.assignment.oct282025.investment;

public class StockInvestment extends Investment {
	int growthRate = 18;

	void calculateReturns() {
		double returns = investmentAmount * (Math.pow((1 + growthRate / 100), investmentDuration));
		System.out.println("Total returns : Rs "+returns);
	}
}
