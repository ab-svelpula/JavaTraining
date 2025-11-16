package inheritance_encapsulation;

public class Payment {
	 protected double amount;

	    public Payment(double amount) {
	        this.amount = amount;
	    }

	    public void pay() {
	        System.out.printf("Processing payment of ₹%.2f%n", amount);
	    }

}
