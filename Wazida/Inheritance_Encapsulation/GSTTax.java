package inheritance_encapsulation;

public class GSTTax extends Tax{
	 private double gstRate;

	    public GSTTax(double amount, double gstRate) {
	        super(amount);
	        this.gstRate = gstRate;
	    }

	    @Override
	    public double calculateTax() {
	        // GST = amount × gstRate%
	        return amount * (gstRate / 100);
	    }
}
