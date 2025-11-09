package com.accu.assignment.nov052025.InsuranceCompany;

public class MainClass {

	public static void main(String[] args) {
		HealthInsurance healthInsurance = new HealthInsurance("H78137138", "Steave Rogers", 7000);
		healthInsurance.showPolicyDetails();
		healthInsurance.calculatePremium();

		LifeInsurance lifeInsurance = new LifeInsurance("L78137138", "Steave Rogers", 7000);
		lifeInsurance.showPolicyDetails();
		lifeInsurance.calculatePremium();
		
		VehicleInsurance vehicleInsurance = new VehicleInsurance("V78137138", "Steave Rogers", 7000);
		vehicleInsurance.showPolicyDetails();
		vehicleInsurance.calculatePremium();
	}

}
