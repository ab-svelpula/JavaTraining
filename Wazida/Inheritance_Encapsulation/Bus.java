package inheritance_encapsulation;

public class Bus extends Vehicle{
	public Bus(String vehicleNumber, double distance) {
        super(vehicleNumber, distance);
    }

    @Override
    public double calculateFare() {
        // ₹8 per km, no base fare
        return distance * 8;
    }

}
