package constructors_scanner_classes;

public class Book {
	Book(){
		System.out.println("Book Details");
	}
	Book(String name){
		this();
		System.out.println("Name of the Book is "+name);
	}
	Book(String author,int year, int price, String name){
		this(name);
		System.out.println("Author of the book is "+author);
		System.out.println("published year is "+year);
		System.out.println("price of the book is "+price);
	}

}
