package com.accu.polymorphism;

public class Class1 {

	void add() {
		System.out.println("method no args");
	}

	void add(int a, int b) {
		int c = a + b;
		System.out.println("method int a, b args" + c);
	}

	void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("method int a, b, c args" + d);
	}
	void add(float a, float b) {
		float c = a + b;
		System.out.println("method float a, b args" + c);
	}
}
