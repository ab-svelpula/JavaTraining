package CollectionTypes;

import java.util.TreeSet;

public class ProductMain {

	 public static void main(String[] args) {
	        // TreeSet with custom Comparator
	        TreeSet<Product> products = new TreeSet<>(new SortByPrice());

	        // Add products
	        products.add(new Product(101, "Laptop", 75000));
	        products.add(new Product(102, "Smartphone", 45000));
	        products.add(new Product(103, "Tablet", 30000));
	        products.add(new Product(104, "Smartwatch", 15000));
	        products.add(new Product(105, "Headphones", 5000));

	        // Display sorted products
	        System.out.println("Products sorted by price (ascending):");
	        for (Product p : products) {
	            System.out.println(p);
	        }
	    }


}
