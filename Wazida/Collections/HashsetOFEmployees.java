
package collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetOFEmployees {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Wazida");
        h.add("Aravind");
        h.add("Javid");
        h.add("Arun");
        h.add("Sajid");
        h.add("Priya");

        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Program finished.");
        System.exit(0);
    }

}
