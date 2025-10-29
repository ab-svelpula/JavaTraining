package com.accu.assignment.oct282025.order;

public class Order {
	void calculateBill(int productPrice) {
		System.out.println("Total Payble Price is : Rs " + productPrice);
	}

	void calculateBill(int productPrice, int numberOfItems) {
		System.out.println("Total Payble Price is : Rs " + productPrice * numberOfItems);
	}

	void calculateBill(int productPrice, int numberOfItems, int discount) {
		System.out.println("Total Payble Price is : Rs " + ((productPrice * numberOfItems)-((productPrice * numberOfItems) * discount / 100)));
	}
}
