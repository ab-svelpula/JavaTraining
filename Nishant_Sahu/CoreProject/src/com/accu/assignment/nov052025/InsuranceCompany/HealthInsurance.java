package com.accu.assignment.nov052025.InsuranceCompany;

public class HealthInsurance extends InsuranceCompany {

	public HealthInsurance(String accountNumber, String accountholder, double balance) {
		super(accountNumber, accountholder, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculatePremium() {
		
		System.out.println("premium for health insurance : " + (premium+1000));

	}

}
