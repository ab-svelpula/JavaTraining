package com.accu.assignment.nov062025.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NestedExceptionHandling {
	public static void main(String[] args) {
		try (FileReader file = new FileReader("d:\\Accurate data\\PLAPI Sprints\\New Text Document.txt")) {
			System.out.println(file.read());
			try {
				int a = 23 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Can not devide by zero. " + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found please check the path. " + e);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
