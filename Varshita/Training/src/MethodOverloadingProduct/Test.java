package MethodOverloadingProduct;

public class Test {
	public static void main (String[] args) {
		Order obj = new Order();
		obj.calculateBill(1000);		
		obj.calculateBill(200, 5);
		obj.calculateBill(300, 10, 100);
	}

}
