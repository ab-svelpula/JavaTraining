package com.accu.assignment.oct292025.AccessModifiers.vehicle;

public class Vehicle {
	protected String brand;
	protected String type;
	protected String colour;

	public Vehicle(String brand, String type, String colour) {
		super();
		this.brand = brand;
		this.type = type;
		this.colour = colour;
	}

	protected void showVehicleDetails() {
		System.out.println("Type : " + type);
		System.out.println("Brand : " + brand);
		System.out.println("Colour : " + colour);
	}
}
