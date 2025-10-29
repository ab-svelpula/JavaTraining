package com.accu.assignment.oct282025.insurance;

public class VehiclePolicy extends InsurancePolicy{
	void calculatePremium() {
		super.calculatePremium();
		System.out.println("This is the calculated primium for your vehicle insurance.");
	}
}
