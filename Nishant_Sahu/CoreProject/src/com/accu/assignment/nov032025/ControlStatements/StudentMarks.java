package com.accu.assignment.nov032025.ControlStatements;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String studentName = scan.nextLine();
		System.out.println("Enter Maths mark: ");
		int mathsMark = scan.nextInt();
		System.out.println("Enter Science mark: ");
		int scienceMark = scan.nextInt();
		System.out.println("Enter English mark: ");
		int englishMark = scan.nextInt();
		System.out.println("Enter hindi mark: ");
		int hindiMark = scan.nextInt();
		System.out.println("Enter geography mark: ");
		int geaographyMark = scan.nextInt();
		scan.close();
		int totalMarks = mathsMark + scienceMark + englishMark + hindiMark + geaographyMark;
		int avarageMarks = totalMarks / 5;

		String grade = "";
		if (mathsMark <= 35 || scienceMark <= 35 || englishMark <= 35 || hindiMark <= 35 || geaographyMark <= 35) {
			System.out.println("Error: Student is not qualified.");
			grade = "Fail";
		} else if (avarageMarks >= 90) {
			grade = "A";
			System.out.println("Distintion.");
		} else if (avarageMarks >= 80 && avarageMarks < 90) {
			grade = "A";

		} else if (avarageMarks >= 70 && avarageMarks < 80) {
			grade = "B";
		} else if (avarageMarks >= 60 && avarageMarks < 70) {
			grade = "C";
		} else if (avarageMarks >= 35 && avarageMarks < 60) {
			grade = "D";
		} else {
			System.out.println("Error: Student is not qualified.");
			grade = "Fail";
		}
		System.out.println("Student Name : " + studentName);
		System.out.println("Maths mark : " + mathsMark);
		System.out.println("Science mark : " + scienceMark);
		System.out.println("English mark : " + englishMark);
		System.out.println("Hindi mark : " + hindiMark);
		System.out.println("Geography mark : " + geaographyMark);
		System.out.println("Total marks : " + totalMarks);
		System.out.println("Avarage marks : " + avarageMarks);
		System.out.println("Grade : " + grade);
	}
}
