package com.accu.assignment.oct292025.Encapsulation.Customer;

import java.util.regex.Pattern;

public class Customer {
	private String mobileNumber;
	private String emailId;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		if (Pattern.matches("^\\d{10}$", mobileNumber))
			this.mobileNumber = mobileNumber;
		else
			System.out.println("Error: Invalid mobile number. Please specify a correct mobile number");
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		if (Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$", emailId))
			this.emailId = emailId;
		else
			System.out.println("Error: Invalid email Id. please specify a correct email id.");
	}

}
