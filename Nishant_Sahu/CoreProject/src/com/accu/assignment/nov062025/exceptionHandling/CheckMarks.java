package com.accu.assignment.nov062025.exceptionHandling;

public class CheckMarks {
	public void checkMarks(int marks) throws Exception {
		if (marks < 35) {
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		try {
			new CheckMarks().checkMarks(12);
		} catch (Exception e) {
			System.out.println("Student failed the test.");
		}
	}
}
