package interfaces_abstract_classes;

public class Clothing extends Product{

	@Override
	public void calculateDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Total price for the clothes is "+price);
		System.out.println("After discount "+(price*0.4));
		
	}

}
