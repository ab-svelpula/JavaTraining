package inheritance_encapsulation;

public class Delivery {
	protected String destination;
    protected double packageWeight; // in kilograms

    public Delivery(String destination, double packageWeight) {
        this.destination = destination;
        this.packageWeight = packageWeight;
    }

    public double deliveryCharge() {
        // Default base charge
        return packageWeight * 10; // ₹10 per kg
    }

    public void showDeliveryDetails() {
        System.out.println("Destination: " + destination);
        System.out.println("Package Weight: " + packageWeight + " kg");
        System.out.printf("Delivery Charge: ₹%.2f%n", deliveryCharge());
    }

}
