package inheritance_encapsulation;

public class Vehicle {
	// Base class
	    protected String vehicleNumber;
	    protected double distance; // in kilometers

	    public Vehicle(String vehicleNumber, double distance) {
	        this.vehicleNumber = vehicleNumber;
	        this.distance = distance;
	    }

	    public double calculateFare() {
	        // Default fare logic (can be overridden)
	        return distance * 10; // ₹10 per km as base rate
	    }

	    public void showFareDetails() {
	        System.out.println("Vehicle Number: " + vehicleNumber);
	        System.out.println("Distance: " + distance + " km");
	        System.out.printf("Fare: ₹%.2f%n", calculateFare());
	    }
	}


