package com.accu.assignment.oct282025.Vehicle;

public class Cab extends Vehicle {
	
	int cabFare = 2000;

	void calculateFare() {
	
		System.out.println("Total payble fare : Rs "+(cabFare+standardFare));
	}
}
