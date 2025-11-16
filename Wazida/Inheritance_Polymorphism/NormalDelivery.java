package inheritance_encapsulation;

public class NormalDelivery extends Delivery {
    public NormalDelivery(String destination, double packageWeight) {
        super(destination, packageWeight);
    }

    @Override
    public double deliveryCharge() {
        // ₹8 per kg, no extra fee
        return packageWeight * 8;
    }

}
