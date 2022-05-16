package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test78 {
	public static void main(String[] args) {
		// hash map
		System.out.println("main method is started..");

		HashMap<Integer, String> h1 = new HashMap<>();
		h1.put(23, "shubham");
		h1.put(11, "Mango");
		h1.put(12, "Grapes");
		h1.put(45, "apple");

		Iterator<Entry<Integer, String>> itr = h1.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> st = itr.next();
			//System.out.println(st);
			System.out.println(st.getKey()+" "+st.getValue());
		}
		System.out.println("Main method is stopped..");
	}
}
