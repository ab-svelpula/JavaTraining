package com.accu.assignment.nov062025.exceptionHandling;

public class ArrayException {
	public static void main(String[] args) {
		int[] numbers = { 32, 34, 12, 13, 45 };
		try {
			System.out.println("nth element : " + numbers[2]);
		} catch (Exception e) {
			System.out.println("Trying to access invlid index use index between 0 to " + (numbers.length - 1));
		}
	}

}
