package collectionFrameWork;

import java.util.ArrayList;

public class TwoArrayLists {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		al1.add("Mango");
		al1.add("Apple");
		al1.add("Orange");
		al1.add("PineApple");
		al1.add("Plum");
		System.out.println("First arrayList\n"+al1);
		
		al2.add("potato");
		al2.add("Ladys Finger");
		al2.add("Tomato");
		al2.add("Green Vegetables");
		al2.add("Cabbage");
		System.out.println("\nSecond arrayList\n"+al2);
		
		al1.addAll(al2);
		System.out.println("\nAfter merging two array list\n"+al1);
	}

}
