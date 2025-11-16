package inheritance_encapsulation;

public class Order {

	    // Calculate bill with only product price
	    public double calculateBill(double price) {
	        return price;
	    }

	    // Calculate bill with product price and quantity
	    public double calculateBill(double price, int quantity) {
	        return price * quantity;
	    }

	    // Calculate bill with product price, quantity, and discount
	    public double calculateBill(double price, int quantity, double discountPercent) {
	        double total = price * quantity;
	        double discount = total * (discountPercent / 100);
	        return total - discount;
	    }

	    public static void main(String[] args) {
	        Order order = new Order();

	        System.out.printf("Bill (Price only): ₹%.2f%n", order.calculateBill(500));
	        System.out.printf("Bill (Price + Quantity): ₹%.2f%n", order.calculateBill(500, 3));
	        System.out.printf("Bill (Price + Quantity + Discount): ₹%.2f%n", order.calculateBill(500, 3, 10));
	    }
	}


