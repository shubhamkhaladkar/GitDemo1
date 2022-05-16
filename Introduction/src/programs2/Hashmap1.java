package programs2;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		HashMap<Integer, String> h1 = new HashMap<>();

		h1.put(23, "Shubham");
		h1.put(21, "Nikhil");
		h1.put(15, "Ayush");

		for (Map.Entry<Integer, String> a : h1.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());
		}

		System.out.println("main method ended..");
	}
}
