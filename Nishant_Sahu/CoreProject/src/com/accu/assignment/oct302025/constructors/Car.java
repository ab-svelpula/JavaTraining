package com.accu.assignment.oct302025.constructors;

public class Car {
	private String model;
	private String brand;
	private double price;

	public Car(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public void showCarDetails() {
		System.out.println("Car's brand : "+brand);
		System.out.println("Car's model : "+model);
		System.out.println("Car's price : "+price);
	}
}
