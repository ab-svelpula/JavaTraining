package CollectionTypes;

import java.util.Comparator;

public class Product {

int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - $" + price;
    }
}

// Comparator to sort by price
class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price); // Ascending order
    }


}
