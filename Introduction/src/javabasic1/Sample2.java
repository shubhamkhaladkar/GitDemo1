package javabasic1;

import java.util.HashSet;
import java.util.Iterator;

public class Sample2 {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();

		hs.add("shubham");
		hs.add(null);
		hs.add("shubham");
		hs.add(123);
		hs.add('C');

		Iterator<Object> itr = hs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(hs.isEmpty());
		System.out.println("---------");
		System.out.println(hs.size());
		System.out.println("------");
		hs.clear();
		System.out.println(hs);

	}
}
