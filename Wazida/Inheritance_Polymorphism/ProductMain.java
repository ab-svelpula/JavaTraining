package inheritance_encapsulation;

public class ProductMain {
	public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 60000);
        Clothing shirt = new Clothing("Formal Shirt", 2000);

        laptop.showProductDetails();
        System.out.println();
        shirt.showProductDetails();
    }

}
