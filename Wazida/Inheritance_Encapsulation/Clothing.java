package inheritance_encapsulation;

public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        // 20% discount on clothing
        return price - (price * 0.20);
    }

}
