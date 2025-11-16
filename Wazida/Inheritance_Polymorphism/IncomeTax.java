package inheritance_encapsulation;

public class IncomeTax extends Tax {
    public IncomeTax(double income) {
        super(income);
    }

    @Override
    public double calculateTax() {
        // Simple slab: 10% for income up to ₹5L, 20% for ₹5L–₹10L, 30% above ₹10L
        if (amount <= 500000) {
            return amount * 0.10;
        } else if (amount <= 1000000) {
            return amount * 0.20;
        } else {
            return amount * 0.30;
        }
    }
    		

}
