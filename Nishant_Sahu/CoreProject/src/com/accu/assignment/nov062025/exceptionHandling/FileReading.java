package com.accu.assignment.nov062025.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) {
		try (FileReader file = new FileReader("C:\\Accurate data\\PLAPI Sprints\\New Text Document.txt")) {
			System.out.println(file.read());
		} catch (FileNotFoundException e) {
			System.out.println("File not found please check the path.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
