package com.accu.assignment.oct282025.payment;

public class InternetBankingPayment extends Payment {
	int netBanckingCharges = 59;

	void pay() {

		System.out.println("Payment is successful of : Rs " + (amount + netBanckingCharges));
	}
}
