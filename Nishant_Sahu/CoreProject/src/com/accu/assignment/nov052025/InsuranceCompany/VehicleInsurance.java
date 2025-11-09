package com.accu.assignment.nov052025.InsuranceCompany;

public class VehicleInsurance extends InsuranceCompany {

	public VehicleInsurance(String accountNumber, String accountholder, double balance) {
		super(accountNumber, accountholder, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculatePremium() {
		
		System.out.println("premium for vehicle insurance : " + (premium+5000));

	}

}
