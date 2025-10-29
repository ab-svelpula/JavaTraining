package com.accu.assignment.oct282025.claim;

public class MainClass {

	public static void main(String[] args) {
		AccidentClaim ac = new AccidentClaim();
		TheftClaim tc = new TheftClaim();
		ac.approveClaim();
		tc.approveClaim();
	}

}
