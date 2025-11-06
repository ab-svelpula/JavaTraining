package com.accu.assignment.oct292025.AccessModifiers.car;

import com.accu.assignment.oct292025.AccessModifiers.vehicle.Vehicle;

public class Car extends Vehicle {

	public Car(String brand, String type, String colour) {
		super(brand, type, colour);
	}

	public static void main(String[] args) {
		new Car("Maruti", "Sedan", "Red").showVehicleDetails();

	}

}
