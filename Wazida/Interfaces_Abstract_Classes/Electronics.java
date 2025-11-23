package interfaces_abstract_classes;

public class Electronics extends Product {

	@Override
	public void calculateDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Total price for the electonic product is "+price);
		System.out.println("After discount "+(price*0.5));
		
	}
	

}
