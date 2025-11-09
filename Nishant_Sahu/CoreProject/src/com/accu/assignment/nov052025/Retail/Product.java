package com.accu.assignment.nov052025.Retail;

public abstract class Product {

	String name;
	String brand;
	double price;

	public Product(String name, String brand, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public void showProductDetails() {
		System.out.println("Name : " + name);
		System.out.println("brand : " + brand);
		System.out.println("price : " + price);
	}

	public abstract void calculateDiscount();

}
