package com.accu.assignment.oct282025.insurance;

public class HealthPolicy extends InsurancePolicy{
	void calculatePremium() {
		super.calculatePremium();
		System.out.println("This is the calculated primium for your health insurance.");
	}
}
