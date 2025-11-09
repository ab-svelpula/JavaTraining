package com.accu.assignment.oct302025.constructors;

public class Product {
	private String name;
	private double price;

	public Product() {
		System.out.println("Welcome to product class");
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void showProductDetails() {
		System.out.println("Product's name : " + name);
		System.out.println("Product's price : " + price);
	}

}
