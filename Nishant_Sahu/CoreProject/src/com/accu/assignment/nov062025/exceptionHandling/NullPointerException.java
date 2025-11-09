package com.accu.assignment.nov062025.exceptionHandling;

public class NullPointerException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			System.out.println("Can not find length of a null string. " + e);

		}

	}
}
