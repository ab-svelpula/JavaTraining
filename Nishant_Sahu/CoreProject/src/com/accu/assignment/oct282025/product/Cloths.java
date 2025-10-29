package com.accu.assignment.oct282025.product;

public class Cloths extends Product {
	
	void getDiscount() {
		double discountedPrice = price - (price*0.15);
		System.out.println("Price after 15% discount : Rs "+discountedPrice);
	}
}
