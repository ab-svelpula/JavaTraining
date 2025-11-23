package interfaces_abstract_classes;

public abstract class Product {
	String name;
	String brand;
	double price;
	
	public void totalPrice(double total) {
		price = price + total;
	}
	public abstract void calculateDiscount();
	

}
