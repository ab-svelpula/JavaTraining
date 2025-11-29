package collectionFrameWork;

import java.util.Stack;

public class StackBooks {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Java");
		s.push("python");
		s.push("c programming");
		s.push("embedded systems");
		
		System.out.println("Books in the stack are\n"+s);
		
		String borrowedBook = (String) s.pop();
		System.out.println("\nBorrowed Book is "+borrowedBook);
		System.out.println("\nBooks in the stacks after borrowing\n "+s);
		
		s.push(borrowedBook);
		System.out.println("\nReturning the book "+borrowedBook);
		System.out.println("\nBooks in the stack after return\n"+s);
		
	}

}
