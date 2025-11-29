package CollectionTypes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordFrequencyUsingHashMap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sen = s.nextLine();
		String[] words = sen.split("\\s+");
		
		HashMap<String, Integer> hm = new HashMap();
		for(String word :words)
		{
			word = word.toLowerCase();
			hm.put(word, hm.getOrDefault(word, 0)+1);
		}
		System.out.println("Word count\n");
		for(Map.Entry<String, Integer> en : hm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		s.close();
	}

}
