package com.accu.assignment.oct282025.claim;

public class TheftClaim extends Claim{
	void approveClaim() {
		super.approveClaim();
		System.out.println("Theft claim is approved.");
	}
}
