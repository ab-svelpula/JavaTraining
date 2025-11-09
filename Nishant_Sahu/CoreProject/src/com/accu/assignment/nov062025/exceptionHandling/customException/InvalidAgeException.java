package com.accu.assignment.nov062025.exceptionHandling.customException;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
