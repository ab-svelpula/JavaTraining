package com.accu.assignment.oct292025.Encapsulation.Product;

public class MainClass {
	String user;
	public static void main(String[] args) {
		Product p = new Product();
		p.setName("Table Cloth");
		p.setPrice(678, "ADMIN");
		p.setProductId("YH676H");
		System.out.println("Product : "+p.getName());
		System.out.println("Product Id : "+p.getProductId());
		System.out.println("Product Price: "+p.getPrice());

	}

}
