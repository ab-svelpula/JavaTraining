package com.accu.assignment.oct282025.product;

public class Electronics extends Product {
	
	void getDiscount() {
		double discountedPrice = price - (price*0.12);
		System.out.println("Price after 12% discount : Rs "+discountedPrice);
	}
}
