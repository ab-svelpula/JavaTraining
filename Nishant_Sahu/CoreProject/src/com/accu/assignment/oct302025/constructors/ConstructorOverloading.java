package com.accu.assignment.oct302025.constructors;

public class ConstructorOverloading {
	private String name;
	private int age;
	private boolean graduate;
	private String address;
	private String fathersName;

	public ConstructorOverloading(String name) {
		System.out.println(name);
	}

	public ConstructorOverloading(String name, String address) {
		System.out.println(address+" "+name);
	}

	public ConstructorOverloading(String name, String address, int age) {
		System.out.println(name+" "+age+" "+address);
	}

	public ConstructorOverloading(String name, int age) {
		System.out.println(name+" "+age);
	}

	public ConstructorOverloading(boolean graduate) {
		System.out.println(graduate);
	}
	
	public ConstructorOverloading(boolean graduate, String fathersName) {
		System.out.println(fathersName+" "+graduate);
	}
}
