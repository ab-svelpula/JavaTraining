package com.accu.assignment.nov052025.Retail;

public class MainClass {

	public static void main(String[] args) {
		Electronics electronics = new Electronics("Washing Machine", "Samsung", 25000);
		electronics.showProductDetails();
		electronics.calculateDiscount();
		
		Clothing clothing = new Clothing("Jeans", "Spykar", 2599);
		clothing.showProductDetails();
		clothing.calculateDiscount();
		
		Groceries groceries = new Groceries("Cheese", "Amul", 140);
		groceries.showProductDetails();
		groceries.calculateDiscount();

	}

}
