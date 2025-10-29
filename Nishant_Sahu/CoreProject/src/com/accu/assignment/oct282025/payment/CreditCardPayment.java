package com.accu.assignment.oct282025.payment;

public class CreditCardPayment extends Payment {
	int creditCardCharges = 99;

	void pay() {

		System.out.println("Payment is successful of : Rs " + (amount + creditCardCharges));
	}
}
