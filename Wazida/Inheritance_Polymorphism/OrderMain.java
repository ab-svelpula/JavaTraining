package inheritance_encapsulation;

public class OrderMain {
	public static void main(String[] args) {
        ExpressDelivery express = new ExpressDelivery("Hyderabad", 5);
        NormalDelivery normal = new NormalDelivery("Bengaluru", 5);

        express.showDeliveryDetails();
        System.out.println();
        normal.showDeliveryDetails();
    }

}
