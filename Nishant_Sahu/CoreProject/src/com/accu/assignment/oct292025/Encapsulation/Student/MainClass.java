package com.accu.assignment.oct292025.Encapsulation.Student;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Steve Rogers");
		s.setRollNumber(17);
		s.setMarks(443);
		System.out.println("Student : "+s.getName());
		System.out.println("Roll No. : "+s.getRollNumber());
		System.out.println("Marks : "+s.getMarks());

	}

}
