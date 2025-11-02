package com.aaditya.constructors.homework;

public class Student {
	String name;
	int rollNo;
	int marks;
	Student(String name, int rollNo, int marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Number: "+rollNo);
		System.out.println("Student Marks: "+marks);

	}
}
