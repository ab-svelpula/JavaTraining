package com.accu.assignment.nov052025.Retail;

public class Electronics extends Product {

	

	public Electronics(String name, String brand, double price) {
		super(name, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateDiscount() {
		double discount = price*0.1;
		System.out.println("Discounted price : "+(price-discount));
		
	}

}
