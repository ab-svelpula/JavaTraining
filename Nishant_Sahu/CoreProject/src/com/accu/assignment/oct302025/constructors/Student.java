package com.accu.assignment.oct302025.constructors;

public class Student {
	private String name;
	private int rollNumber;
	private int marks;

	public Student() {
		System.out.println("Welcome to student class");
	}

	public Student(String name, int rollNumber, int marks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public void showStudentDetails() {
		System.out.println("Student's name : " + name);
		System.out.println("Student's roll number : " + rollNumber);
		System.out.println("Student's marks : " + marks);
	}

}
