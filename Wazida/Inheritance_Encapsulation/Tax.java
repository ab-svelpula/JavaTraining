package inheritance_encapsulation;

public class Tax {
	protected double amount;

    public Tax(double amount) {
        this.amount = amount;
    }

    public double calculateTax() {
        // Default tax logic (can be overridden)
        return 0;
    }

    public void showTaxDetails() {
        System.out.println("Amount: ₹" + amount);
        System.out.printf("Calculated Tax: ₹%.2f%n", calculateTax());
    }

}
