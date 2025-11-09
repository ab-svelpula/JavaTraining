package com.accu.assignment.nov052025.InsuranceCompany;

public class LifeInsurance extends InsuranceCompany {

	public LifeInsurance(String accountNumber, String accountholder, double balance) {
		super(accountNumber, accountholder, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculatePremium() {
		
		System.out.println("premium for life insurance : " + (premium+500));

	}

}
