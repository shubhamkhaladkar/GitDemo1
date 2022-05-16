package javabasic1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample3 {
	public static void main(String[] args) {
		System.out.println("Main method is started..");

		LinkedHashSet lhs = new LinkedHashSet<>();

		lhs.add("shubham");
		lhs.add("sham");
		lhs.add(23);
		lhs.add(null);
		lhs.add(23);
		lhs.add('c');

		Iterator itr = lhs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		System.out.println(lhs.contains('c'));
		System.out.println("Main method ended..");
	}
}
