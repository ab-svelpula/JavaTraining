package com.accu.assignment.oct282025.product;

public class Product {
	int price = 999;
	String name = "All objects";
	void getDiscount() {
		double discountedPrice = price - (price*0.1);
		System.out.println("Price after 10% discount : Rs "+discountedPrice);
	}
}
