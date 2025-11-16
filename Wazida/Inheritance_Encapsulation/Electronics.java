package inheritance_encapsulation;

public class Electronics extends Product{
	public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        // 10% discount on electronics
        return price - (price * 0.10);
    }

}
