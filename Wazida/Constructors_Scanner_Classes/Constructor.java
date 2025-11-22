package constructors_scanner_classes;

public class Constructor {
	Constructor(){
		System.out.println("Demo of the constructor class");
	}
	Constructor(int a, int b){
		this();
		int c= a+b;
		System.out.println("Addition of a and b is "+c);
	}
	Constructor(int a, int b, int c){
		this(a,b);
		int d = a+b+c;
		System.out.println("Addition of a,b,c is "+d);
	}

}
