package com.accu.assignment.nov062025.exceptionHandling;

public class MultipleException {

	public static void main(String[] args) {
		int numbers[] = { 32, 67, 43, 444, 234, 12, 45, 0 };
		try {
			int result = numbers[1] / numbers[7];
			System.out.println("Result = " + result);
			System.out.println("nth element = " + numbers[9]);
		} catch (ArithmeticException ae) {
			System.out.println("Can not devide by zero." + ae.getMessage());
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Enter index between 0 to " + numbers.length + "\n" + aiob.getMessage());
		} finally {
			System.out.println("Program executed successfully.");
		}

	}

}
