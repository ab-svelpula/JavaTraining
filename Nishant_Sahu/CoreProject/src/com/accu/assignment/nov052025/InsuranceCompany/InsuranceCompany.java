package com.accu.assignment.nov052025.InsuranceCompany;

public abstract class InsuranceCompany {
	String policyNumber;
	String policyHolder;
	double premium;
	
	public InsuranceCompany(String policyNumber, String policyHolder, double premium) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolder = policyHolder;
		this.premium = premium;
	}

	public void showPolicyDetails() {
		System.out.println("Account holder name : "+policyHolder);
		System.out.println("Account number name : "+policyNumber);
		System.out.println("Balance : "+premium);
	}
	
	public abstract void calculatePremium();

}
