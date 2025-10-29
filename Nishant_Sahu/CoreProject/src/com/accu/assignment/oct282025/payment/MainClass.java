package com.accu.assignment.oct282025.payment;

public class MainClass {

	public static void main(String[] args) {
		CreditCardPayment ccp = new CreditCardPayment();
		InternetBankingPayment nbp = new InternetBankingPayment();
		ccp.pay();
		nbp.pay();

	}

}
