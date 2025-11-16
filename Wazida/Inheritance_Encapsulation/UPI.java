package inheritance_encapsulation;

public class UPI extends Payment {
    private String upiId;

    public UPI(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("UPI Payment:");
        System.out.println("UPI ID: " + upiId);
        System.out.printf("Amount Paid: ₹%.2f%n", amount);
    }

}
