package inheritance_encapsulation;

public class Cab extends Vehicle{
	 private double baseFare = 50; // Flat base fare

	    public Cab(String vehicleNumber, double distance) {
	        super(vehicleNumber, distance);
	    }

	    @Override
	    public double calculateFare() {
	        // ₹50 base fare + ₹15 per km
	        return baseFare + (distance * 15);
	    }

}
