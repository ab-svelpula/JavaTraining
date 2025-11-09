package com.accu.assignment.oct302025.constructors;

public class Book {
	private String title;
	private String author;
	private int pages;
	private int rating;
	private String topic;

	public Book(String title, String author) {
		System.out.println("title: " + title + " author: " + author);
	}

	public Book(int pages, String topic) {
		this("Book1", "author1");
		System.out.println("pages: " + pages + " topic: " + topic);
	}

	public Book(int rating) {
		this(32, "topic1");
		System.out.println("rating: " + rating);
	}
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pages);
		System.out.println(topic);
		System.out.println(rating);
	}
}
