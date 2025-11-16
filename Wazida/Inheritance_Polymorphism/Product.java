package inheritance_encapsulation;

public class Product {
	protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double applyDiscount() {
        // Default: no discount
        return price;
    }

    public void showProductDetails() {
        System.out.println("Product: " + name);
        System.out.printf("Original Price: ₹%.2f%n", price);
        System.out.printf("Price After Discount: ₹%.2f%n", applyDiscount());
    }
	

}
