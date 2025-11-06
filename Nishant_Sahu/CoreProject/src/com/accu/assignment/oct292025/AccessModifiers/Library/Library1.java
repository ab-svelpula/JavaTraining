package com.accu.assignment.oct292025.AccessModifiers.Library;

public class Library1 {
	void getLibraryDetails() {
		Library library = new Library();
		library.showLibraryBooksCount();
		library.showLibraryCardOwner();
		library.showLibraryCardVaidity();
//		library.showLibrarian(); //can not be accessed
	}

}
