package com.accu.assignment.oct282025.investment;

public class MainClass {
	public static void main(String[] args) {
		MutualFundInvestment mfi = new MutualFundInvestment();
		StockInvestment si = new StockInvestment();
		mfi.calculateReturns();
		si.calculateReturns();
	}
}
