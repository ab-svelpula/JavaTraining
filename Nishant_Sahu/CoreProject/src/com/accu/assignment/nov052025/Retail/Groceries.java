package com.accu.assignment.nov052025.Retail;

public class Groceries extends Product {

	

	public Groceries(String name, String brand, double price) {
		super(name, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateDiscount() {
		double discount = price*0.05;
		System.out.println("Discounted price : "+(price-discount));
		
	}

}
