package CollectionTypes;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapForSortedKeyOrder {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Wazida");
		tm.put(4, "Javid");
		tm.put(3, "Aravind");
		tm.put(2, "Sajid");
		tm.put(5, "Arun");
		
		for(Map.Entry<Integer, String> en : tm.entrySet())
		{
			System.out.println(en.getKey()+"--->"+en.getValue());
		}
	}

}
