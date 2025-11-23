package interfaces_abstract_classes;

public class ProductMain {
	public static void main(String[] args)
	{
		Electronics e = new Electronics();
		e.totalPrice(1000);
		e.calculateDiscount();
		
		Clothing c = new Clothing();
		c.totalPrice(5000);
		c.calculateDiscount();
		
		Groceries g = new Groceries();
		g.totalPrice(4000);
		g.calculateDiscount();
	}

}
