package com.accu.assignment.oct282025.policyCustomer;

public class PolicyHolder extends Customer{
	
	void showPolicyDetails() {
		super.showCustomerDetails();
		String policyType = "Health";
		String policyIdId = "HSR100023";
		int premium = 3800;
		int duration = 12;
		System.out.println("Policy Type : "+policyType);
		System.out.println("Policy Id : "+policyIdId);
		System.out.println("Policy Premium : Rs "+premium+" /month");
		System.out.println("Premium duration : "+duration+" Months");
	}

}
