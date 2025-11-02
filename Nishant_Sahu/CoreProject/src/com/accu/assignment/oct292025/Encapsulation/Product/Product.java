package com.accu.assignment.oct292025.Encapsulation.Product;

public class Product {
	private String productId;
	private int price;
	private String Name;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price, String user) {
		if (user.equals("ADMIN"))
			this.price = price;
		else
			System.out.println("You don't have access to set price.");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
