package inheritance_encapsulation;

public class ExpressDelivery extends Delivery {
    public ExpressDelivery(String destination, double packageWeight) {
        super(destination, packageWeight);
    }

    @Override
    public double deliveryCharge() {
        // ₹20 per kg + ₹50 express fee
        return (packageWeight * 20) + 50;
    }

}
