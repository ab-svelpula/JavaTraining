package com.accu.assignment.oct282025.tax;

public class MainClass {

	public static void main(String[] args) {
		IncomeTax it = new IncomeTax();
		GST gst = new GST();
		it.calculateTax();
		gst.calculateTax();

	}

}
