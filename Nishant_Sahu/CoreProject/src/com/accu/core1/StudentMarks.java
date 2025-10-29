package com.accu.core1;

public class StudentMarks {
	public static void main(String[] args) {
		int englishMarks = 81;
		int scienceMarks = 74;
		int historyMarks = 62;
		int hindiMarks = 54;
		int mathshMarks = 88;
		int totalMarks = (englishMarks+scienceMarks+historyMarks+hindiMarks+mathshMarks);
		int avarageMarks = (englishMarks+scienceMarks+historyMarks+hindiMarks+mathshMarks)/5;
		System.out.println("Total Marks : "+totalMarks);
		System.out.println("Avarage Marks : "+avarageMarks);
	}
}
