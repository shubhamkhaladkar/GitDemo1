package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Script31 {
	public static void main(String[] args) {

		System.out.println("main method is started...");

		ArrayList<String> a = new ArrayList<>(); // arraylist

		a.add("shubham");

		a.add("nikhil");

		a.add("ayush");

		System.out.println(a.size());
		System.out.println(a.get(2));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("--------------");
		TreeSet<String> s = new TreeSet<>();

		s.add("shubham");
		s.add("nikhil");
		s.add("aayush");
		System.out.println(s.size());
		Iterator<String> itr = s.iterator();

		while (itr.hasNext()) {
			String rv = itr.next();
			System.out.println(rv);

		}

		System.out.println("main method is completed..");

	}
}
