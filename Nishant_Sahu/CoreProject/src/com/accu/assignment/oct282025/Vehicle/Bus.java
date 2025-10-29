package com.accu.assignment.oct282025.Vehicle;

public class Bus extends Vehicle {
	
	int busFare = 8000;

	void calculateFare() {
	
		System.out.println("Total payble fare : Rs "+(busFare+standardFare));
	}
}
