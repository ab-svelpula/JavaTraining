package com.accu.assignment.oct302025.controlStatements;

import java.util.Scanner;

public class PassOrfail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks.");
		int marks = scan.nextInt();
		scan.close();
		if (marks >= 35) {
			System.out.println("Student passed with marks: "+marks);
		}else {
			System.out.println("Student failed with marks: "+marks);
		}
	}

}
