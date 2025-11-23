package interfaces_abstract_classes;

public class Groceries extends Product {

	@Override
	public void calculateDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Total price for the groceries product is "+price);
		System.out.println("After discount "+(price*0.2));
		
	}

}
