package javabasic1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		ArrayList a = new ArrayList();
		a.add("shubham");
		a.add(12);
		a.add('A');
		a.add(12);
		a.add(null);

		System.out.println(a.isEmpty());
		System.out.println("------------");
		System.out.println(a.size());
		System.out.println("------------");
		System.out.println(a);
		a.remove(2);
		System.out.println("after removing");
		System.out.println(a);
		a.set(2, 'S');
		System.out.println("after setting");
		System.out.println(a);
		a.clear();
		System.out.println("after clearing");
		System.out.println(a);
		a.add("Nikhil");
		a.add(23.4);
		a.add("Nikh");
		a.add('S');
		a.add(23);
		System.out.println("After adding");
		System.out.println(a);
		a.trimToSize();
		System.out.println("------------");
		Iterator itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
