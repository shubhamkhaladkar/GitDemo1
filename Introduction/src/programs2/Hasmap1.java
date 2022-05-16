package programs2;

import java.util.HashMap;
import java.util.Map;

public class Hasmap1 {
	public static void main(String[] args) {

		System.out.println("main method started...");

		HashMap<Integer, String> h1 = new HashMap<>();

		h1.put(21, "Mango");

		h1.put(2, "Grapes");

		h1.put(4, "Apple");

		h1.put(5, "Apple");

		for (Map.Entry<Integer, String> m1 : h1.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}

	}
}
