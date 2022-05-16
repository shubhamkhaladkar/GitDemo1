package javabasic1;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample {
	public static void main(String[] args) {

		LinkedList ls = new LinkedList<>();

		ls.add("Shubham");
		ls.add("Nikhil");
		ls.add("sambhaji");
		ls.add('A');
		ls.add(23);
		ls.add(23.4);
		ls.add(null);
		ls.add(23);

		Iterator itr = ls.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------");
		ls.addFirst("Mr.");
		ls.add("alive");

		System.out.println(ls);

		System.out.println("----------------");

		ls.removeFirst();
		ls.removeLast();
		System.out.println(ls);
		System.out.println("----------------");
		
		System.out.println(ls.poll());
		System.out.println(ls);
		System.out.println("----------------");
		System.out.println(ls.peek());
		System.out.println(ls);
		

	}
}
