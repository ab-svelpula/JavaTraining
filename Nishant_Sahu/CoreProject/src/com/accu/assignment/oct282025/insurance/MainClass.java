package com.accu.assignment.oct282025.insurance;

public class MainClass {

	public static void main(String[] args) {
		HealthPolicy hi = new HealthPolicy();
		VehiclePolicy vi = new VehiclePolicy();
		vi.calculatePremium();
		hi.calculatePremium();
	}

}
